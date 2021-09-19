#!/bin/sh

#HTTP_LINK=https://ethvm-api.develop.zen-charity.net/
#WS_CLIENT=wss://ethvm-api.develop.zen-charity.net/graphql
OPENSEA_API=

if [ "x$HTTP_LINK" = "x" -o "x$WS_CLIENT" = "x" ]; then
  echo "set HTTP_LINK and WS_CLIENT"
  exit 1
fi
echo "HTTP_LINK=$HTTP_LINK"
echo "WS_CLIENT=$WS_CLIENT"

if [ -f src/configs.ts- ]; then
  cp src/configs.ts- src/configs.ts
else
  cp src/configs.ts src/configs.ts-
fi
sed -ie "s,process.env.VUE_APP_HTTP_LINK,'$HTTP_LINK',g" src/configs.ts || exit
sed -ie "s,process.env.VUE_APP_WS_CLIENT,'$WS_CLIENT',g" src/configs.ts || exit
sed -ie "s,process.env.VUE_APP_OPENSEA_API,'$OPENSEA_API',g" src/configs.ts || exit

echo "config.ts is:"
cat src/config.ts

rm -rf build
find src -name "*.tse" | xargs rm
yarn install
yarn apollo:codegen
yarn build:hash
