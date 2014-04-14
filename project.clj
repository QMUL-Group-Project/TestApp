(defproject testapp "0.1.1-SNAPSHOT"
  :description "Description"
  :url "https://www.url.com"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.apache.lucene/lucene-core "3.0.2"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [clj-http "0.4.1"]]                

  :profiles {:dev {:dependencies [[ring/ring-devel "1.2.0"]]}}
  :test-selectors {:default (complement :integration)
                  :integration :integration
                  :all (fn [_] true)}

  :main testapp
  :uberjar-name "testapp.jar"
   :aot [testapp])

