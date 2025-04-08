(ns clj-crash-course.core-test
  (:require [clojure.test :refer :all]
            [clj-crash-course.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))

(deftest cal-test
  (is (= (cal) 807)))


(def sub (fn [a b]
           (- a b)))

(defn divide [a b]
  (/ a b))


(let [val 12]
  (println val))

(let [x 4
      y 3
      z 3]
  (println z))


;; vector

(type [ 2 5 3])

(get [4 2] 5)

;; map

{:e 12 "e" 23 4 6}

;; set
#{2 3 2 4}
(set [1 2 1 2])