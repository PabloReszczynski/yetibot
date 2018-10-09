(ns yetibot.test.commands.replace
  (:require [midje.sweet :refer [fact =>]]
            [yetibot.commands.replace :refer [replace-cmd]]))

(fact "should have the same API as `clojure.string/replace`"
      (replace-cmd {:match ["foobar" "o" "a"]}) => "faabar"
      (replace-cmd {:match ["foobar" "z" "a"]}) => "foobar"
      (replace-cmd {:match ["foobarfoo" "foo" "bar"]}) => "barbarbar"
      (replace-cmd {:match ["foobarfoo" "baz" "bar"]}) => "foobarfoo"
      (replace-cmd {:match ["food" "o" "$"]}) => "f$$d"
      (replace-cmd {:match ["food" "o" "\\"]}) => "f\\\\d")
 ;; (replace-cmd {:match ["foobarfoo" #"foo"] :opts ["-u"]}) => "FOObarFOO")
