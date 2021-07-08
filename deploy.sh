#!/bin/sh

test "x$1" = "x-y" && YES='1'

cd newclient
./build.sh || exit

if [ "x$YES" != "x1" ]; then
  read -p "really deploy? [y/N]: " yn
  test "x$yn" = "xy" || exit
fi

BUCKET=zen-charity.net.develop.ethvm
#AWS_ACCESS_KEY_ID: ${{ secrets.ECR_ACCESS_KEY_ID }}
#AWS_SECRET_ACCESS_KEY: ${{ secrets.ECR_SECRET_ACCESS_KEY }}

aws s3 sync dist s3://$BUCKET --delete
