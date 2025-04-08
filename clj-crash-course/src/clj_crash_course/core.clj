(ns clj-crash-course.core 
  (:require [clj-crash-course.common.core :as common]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn hello  []
  (println "Hello, World!" (common/add 1 2)))


(if (= 2 3)
  "fasle"
  "do something")

(defn cal [] 
  (common/add 807 0))