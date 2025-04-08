(ns clj-crash-course.concurrency
  (:require
   [clojure.core.async :as async :refer [>! alts! chan go]]))


(do
  (future
    (Thread/sleep 2000)
    (println "hello"))
  (println "world"))



;; CSP style
;; https://github.com/clojure/core.async/blob/master/examples/walkthrough.clj


(let [c1 (chan)
      c2 (chan)]
  (go (while true
        (let [[v ch] (alts! [c1 c2])] (println "value " v "from " ch))))
  (go (>! c1 "hi"))
  (go (>! c2 "bye")))
  

;;  atom

(def a (atom 2))

;; guarantee to be atomic
(swap! a inc)