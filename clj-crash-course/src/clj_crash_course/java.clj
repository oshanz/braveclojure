(ns clj-crash-course.java)

;; static methods
(def v (Integer/parseInt "12"))
(println v)


;; constructor call
(String. "12")


;;  instance methods
(.intValue v)

