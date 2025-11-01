;;;; Advent of Code 2017 Day 1 - Inverse Captcha

(ns event2017.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2017 1))

(defn- parsed [input] (map #(parse-long (str %)) (str/trim-newline input)))

(defn- captcha-sum
  [seq offset]
  (let [seq-rotated (concat (drop offset seq) (take offset seq))]
    (reduce + 0 (map #(if (= %1 %2) %1 0) seq seq-rotated))))

(defn part-1 [input] (captcha-sum (parsed input) 1)) ; adjacent
(defn part-2
  [input]
  (let [p (parsed input)] (captcha-sum p (quot (count p) 2)))) ; halfway

(aoc/solve puzzle-input part-1 part-2) ; [1390 1232]

