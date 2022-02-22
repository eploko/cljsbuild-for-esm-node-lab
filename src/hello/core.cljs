(ns hello.core
  (:require
   [cljs.nodejs :as nodejs]
   [unified]))

(def path (nodejs/require "path"))

(.log js/console
      "Hello!"
      (.resolve path "~"))
