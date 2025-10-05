(ns event2015.day02
  "Advent of Code 2015 Day 2 - I Was Told There Would Be No Math"
  (:require [clojure.string :as str]))

(defn parse [line] (vec (sort (mapv parse-long (str/split line #"x")))))
(def parse-xf (comp (remove str/blank?) (map parse)))

(defn paper [[a b c]] (+ (* 3 a b) (* 2 a c) (* 2 b c))) ; 2(ab + ac + bc) + ab
(defn ribbon [[a b c]] (+ (* 2 a) (* 2 b) (* a b c))) ; 2a + 2b + abc

(defn part-1 [data] (transduce (comp parse-xf (map paper)) + 0 data))
(defn part-2 [data] (transduce (comp parse-xf (map ribbon)) + 0 data))

(defn -main
  ([& _]
   (let [input (slurp *in*)
         data (str/split-lines input)]
     (println "Solutions:" [(part-1 data) (part-2 data)]))))

(when (= *file* (System/getProperty "babashka.file"))
  (apply -main *command-line-args*))

; Solutions: [1586300 3737498]
