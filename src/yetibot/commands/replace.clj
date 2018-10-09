(ns yetibot.commands.replace
  (:require [clojure.string :as s]
            [yetibot.core.hooks :refer [cmd-hook]]))

(defn replace-cmd
  {:yb/cat #{:util}}
  [{[string find rep] :match [u] :opts}]
  (prn string find rep u)
  (let [up (if (some? u) s/upper-case rep)
        rp (s/replace string find up)]
    rp))
