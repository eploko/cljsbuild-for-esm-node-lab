# Steps

``` sh
clj -M -m cljs.main -co build.edn -v -c
npx esbuild ./out/index.js --bundle --platform=node --outfile=./out/index.bundle.js
node out/index.bundle.js
```

