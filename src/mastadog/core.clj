(ns mastadog.core
  (:gen-class))


(defn myfunc
  "some doc string"
  [x]
  x)

(defn main3
  "I don't do a whole lot ... yet."
  []
  (prn "Hello, World!")
  (myfunc "arg1")) 

(main3)
(myfunc "hello")
