# Steps

``` sh
clj -M -m cljs.main -co build.edn -v -c
npx esbuild ./out/index.js --bundle --platform=node --outfile=./out/index.bundle.js
node out/index.bundle.js
```

The last command results in:

``` text
cljsbuild/out/index.bundle.js:848
window.CLOSURE_UNCOMPILED_DEFINES = { "cljs.core._STAR_global_STAR_": "global", "cljs.core._STAR_target_STAR_": "bundle" };
^

ReferenceError: window is not defined
    at Object.<anonymous> (cljsbuild/out/index.bundle.js:848:1)
    at Module._compile (node:internal/modules/cjs/loader:1101:14)
    at Object.Module._extensions..js (node:internal/modules/cjs/loader:1153:10)
    at Module.load (node:internal/modules/cjs/loader:981:32)
    at Function.Module._load (node:internal/modules/cjs/loader:822:12)
    at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:81:12)
    at node:internal/main/run_main_module:17:47
```


