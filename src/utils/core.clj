(ns utils.core)

(defn first-dup
  "Find the first repeated element in a sequence
   E.g. `first-dup '(2 4 5 19 23 4 1)` ==> 4"
  [xs]
  (reduce (fn [seen x] (if (seen x) (reduced x) (conj seen x))) #{} xs))

