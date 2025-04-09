(ns bird-watcher)



(def last-week [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (assoc birds 6 (inc (last birds))))


(defn day-without-birds? [birds]
  (let [days (some #(= 0 %) birds)]
    (if (= nil days) false days)))

;; (defn day-without-birds? [birds]
;;   (some #(= 0 %) birds))

(defn n-days-count [birds n]
  (reduce + (take n birds)))


(defn busy-days [birds]
  (reduce #(if (>= %2 5) (inc %1) %1) 0 birds))

(defn odd-week? [birds]
  (= birds (take 7 (cycle [1 0]))))
