(ns event2017.day01
  "Advent of Code 2017 Day 1 - Inverse Captcha"
  (:require [clojure.string :as str]))

(defn- captcha-sum
  "Sums digits that match the offset digit in a circular list."
  [s offset]
  (let [digits (map #(- (int %) (int \0)) s) ; assumes all chars are digits
        rotated (concat (nthrest digits offset) (take offset digits))]
    (reduce + (map #(if (= %1 %2) %1 0) digits rotated))))

(defn part-1 [data] (captcha-sum data 1)) ; next digit
(defn part-2 [data] (captcha-sum data (/ (count data) 2))) ; digit halfway round

(defn -main
  [& _]
  (let [input (slurp *in*)
        data (str/trim-newline input)]
    (println "Solutions:" [(part-1 data) (part-2 data)])))

(when (= *file* (System/getProperty "babashka.file"))
  (apply -main *command-line-args*))

; Solutions: [1390 1232]
