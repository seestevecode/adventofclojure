(ns aoc2019.day04
  "Advent of Code 2019 Day 4 - Secure Container"
  (:require [clojure.string :as str]
            [utils.core :as utils]))

(def puzzle-input (slurp "resources/event_2019/aoc2019-d04-input.txt"))

(defn- parse
  [input]
  (let [[start end] (mapv parse-long (str/split (str/trim-newline input) #"-"))]
    (range start (inc end))))

(defn- groups
  "Groups a number by like consecutive digits"
  [num]
  (partition-by identity (utils/digits num)))

(defn- never-decreases? [num] (apply <= (utils/digits num)))
(defn- has-pair? [num] (some #(> (count %) 1) (groups num)))
(defn- has-exact-pair? [num] (some #(= 2 (count %)) (groups num)))

(def pred-part-1 (every-pred has-pair? never-decreases?))
(def pred-part-2 (every-pred has-exact-pair? never-decreases?))

(defn part-1 [input] (count (filter pred-part-1 input)))
(defn part-2 [input] (count (filter pred-part-2 input)))

(comment
  ;; Solutions: 1099 / 710
  (let [input puzzle-input]
    (str "Solutions: " (part-1 (parse input)) " / " (part-2 (parse input)))))

