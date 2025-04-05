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
