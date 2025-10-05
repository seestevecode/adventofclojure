(ns event2015.day01
  "Advent of Code 2015 Day 1 - Not Quite Lisp"
  (:require [clojure.string :as str]))

(defn parse [input] (mapv #(get {\( 1, \) -1} % 0) input))

(defn part-1 [data] (reduce + 0 data))
(defn part-2
  [data]
  (count (take-while (complement neg?) (reductions + 0 data))))

(defn -main
  [& _]
  (let [input (slurp *in*)
        data (parse (str/trim-newline input))]
    (println "Solutions:" [(part-1 data) (part-2 data)])))

(when (= *file* (System/getProperty "babashka.file"))
  (apply -main *command-line-args*))

; Solutions: [280 1797]
