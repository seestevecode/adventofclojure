(ns aoc2017.day01
  "Advent of Code 2017 Day 1 - Inverse Captcha"
  (:require [clojure.string :as str]))

(def puzzle-input (slurp "resources/event_2017/aoc2017-d01-input.txt"))

(defn- parse [input] (map #(parse-long (str %)) (str/trim-newline input)))

(defn- captcha-sum
  [seq offset]
  (let [seq-rotated (concat (drop offset seq) (take offset seq))]
    (reduce + 0 (map #(if (= %1 %2) %1 0) seq seq-rotated))))

(defn part-1 [input] (captcha-sum input 1)) ; adjacent
(defn part-2 [input] (captcha-sum input (quot (count input) 2))) ; halfway round

(comment
  ;; Solutions: 1390 / 1232
  (let [input puzzle-input]
    (str "Solutions: " (part-1 (parse input)) " / " (part-2 (parse input)))))

