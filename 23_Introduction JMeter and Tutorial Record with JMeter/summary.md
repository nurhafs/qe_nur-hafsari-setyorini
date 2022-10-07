## (23) Introduction JMeter and Tutorial Record with JMeter

### Points learned
1. Apache JMeter adalah software open souce dari java murni yang dirancang untuk melakukan pengujian fungsional dan mengukur kinerja situs web. Sering dipakai karena selain open source, JMeter mudah digunakan baik dalam tampilan GUI maupun non GUI.
2. Beberapa komponen dalam JMeter:
	* Test Plan -> big plan (parent)
	* Thread Groups -> run the same scenario
	* Samplers -> request sent to server
	* Config Elements -> elemen untuk konfig / modif sampler
	* Listeners -> perekam data hasil test
	* Timers -> fitur yg jalan paling awal
	* Assertions -> kaya assert di API/Web/Testing (kriteria tambahan)
	* Pre-post processors -> processes response data sebelum/sesudah tes
3. How to use:
	* Open JMeter
	* Select Template
	* Enable HTTP(S) Test Script Recorder
	* Set up Proxy on your Firefox Browser
	* Record start!
	* Record stop
	* Run (can be in CLI mode as well)