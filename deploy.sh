#!/bin/sh

HTTP_LINK=https://ethvm-api.develop.zen-charity.net/
WS_CLIENT=wss://ethvm-api.develop.zen-charity.net/graphql
OPENSEA_API=

test "x$1" = "x-y" && YES='1'

cd newclient


if [ -f src/configs.ts- ]; then
  cp src/configs.ts- src/configs.ts
else
  cp src/configs.ts src/configs.ts-
fi
sed -ie "s,process.env.VUE_APP_HTTP_LINK,'$HTTP_LINK',g" src/configs.ts || exit
sed -ie "s,process.env.VUE_APP_WS_CLIENT,'$WS_CLIENT',g" src/configs.ts || exit
sed -ie "s,process.env.VUE_APP_OPENSEA_API,'$OPENSEA_API',g" src/configs.ts || exit

rm -rf build
find src -name "*.tse" | xargs rm
yarn install
yarn build

if [ "x$YES" != "x1" ]; then
  read -p "really deploy? [y/N]: " yn
  test "x$yn" = "xy" || exit
fi

BUCKET=zen-charity.net.develop.ethvm
#AWS_ACCESS_KEY_ID: ${{ secrets.ECR_ACCESS_KEY_ID }}
#AWS_SECRET_ACCESS_KEY: ${{ secrets.ECR_SECRET_ACCESS_KEY }}

aws s3 sync dist s3://$BUCKET --delete
