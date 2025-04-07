# data structures

- maps {:a 1 :b "adfsdf"}
- vectors [1 2 4]
- list (nth '(1 2 3) 2)
- sets (set [1 1 2])


## features

- arity overloading
(defn foo
    ([a b] (println "two args"))
    ([a] (println "one arg")))

- variable arity arguments
(defn foo
    ([a b & more] (println "more than two args"))
    
- destructuring

- assoc
(assoc {:a 1 :b 2} :c 3)

- repeat / repeatedly fn()
(take 8 (repeat "na"))

- recur
loop [x 1]
    (if (> x 10)
        (recur (inc x))
        x)

- into
(into [] (range 10))

- conj
(conj [1 2 3] 4)

- partial
