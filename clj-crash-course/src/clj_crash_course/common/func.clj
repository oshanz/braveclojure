(ns clj-crash-course.common.func)



(def v [123 123 234 5 2 3434 2345 345356 45634 23])

(map (fn [element] (+ element 12)) v)


(mapv (fn [element element2] 
        (/ element element2)) v v)


(filter (fn [element]
          (odd? element)
          )v)

(remove (fn [d]
         (= d 123)) v)

(remove even? v)

(reduce (fn [acc d] (+ acc d)) 0 v)

(apply + v)

(reduce (fn [acc e]
          (conj acc (+ e 23))) [] v)

(reduce (fn [acc d]
          (let [result (conj acc (* d 2))]
            (println result)
            result
            )) [] v)


(group-by (fn [e]
            (odd? e)) v)

(group-by odd? v)

(count v)

