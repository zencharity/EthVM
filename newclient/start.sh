#!/bin/sh

case "x$1" in
  xdev )
    export VUE_APP_HTTP_LINK=https://ethvm-api.develop.zen-charity.net/
    export VUE_APP_WS_CLIENT=wss://ethvm-api.develop.zen-charity.net/graphql
    export VUE_APP_OPENSEA_API=
    ;;
  xprod )
    export VUE_APP_HTTP_LINK=https://ethvm-api.zen-charity.net/
    export VUE_APP_WS_CLIENT=wss://ethvm-api.zen-charity.net/graphql
    export VUE_APP_OPENSEA_API=
    ;;
  xlocal )
    export VUE_APP_HTTP_LINK=http://localhost:4000/
    export VUE_APP_WS_CLIENT=ws://localhost:4000/
    export VUE_APP_OPENSEA_API=
    ;;
  * )
    echo "$0 <prod | dev | local>"
    exit 1
    ;;
esac

yarn start:dev
