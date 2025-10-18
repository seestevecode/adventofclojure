(ns utils.core)

(defn digits
  "Convert a number into a list of digits"
  [n]
  (map #(- (int %) (int \0)) (str n)))

