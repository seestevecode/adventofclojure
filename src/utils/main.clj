(ns utils.main)

(defn md5-hex
  "Compute MD5 digest of `s` and return as a 32-char lowercase hexadecimal string."
  [s]
  (let [md (java.security.MessageDigest/getInstance "MD5")]
    (.update md (.getBytes s "UTF-8"))
    (let [bytes (.digest md)]
      (apply str (map #(format "%02x" (bit-and % 0xff)) bytes)))))

