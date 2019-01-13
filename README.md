vips_java
=============

Implementation of Vision Based Page Segmentation algorithm in Java. 

The implementation utilizes CSSBox (X)HTML/CSS rendering engine written
by Radek Burget.

*Description of VIPS and my implementation in my master's thesis (in Czech)*

[http://www.fit.vutbr.cz/study/DP/DP.php?id=14163&file=t](http://www.fit.vutbr.cz/study/DP/DP.php?id=14163&file=t "")

*Original work by Microsoft*

[http://www.cad.zju.edu.cn/home/dengcai/VIPS/VIPS_July-2004.pdf](http://www.cad.zju.edu.cn/home/dengcai/VIPS/VIPS_July-2004.pdf "")

*CSSBox*

[http://cssbox.sourceforge.net](http://cssbox.sourceforge.net "")

Compilation
-----------

This project uses Apache Maven. Compile it by running `mvn compile` or `mvn package` if you want to produce the JAR file.

If you have used the `mvn compile` then run:

``java -cp target/classes/ org.fit.vips.VipsTester``

or if `mvn package`:

``java -cp target/vips-java-*.jar org.fit.vips.VipsTester``

to start the VipsTester.

Usage
-----

Just pass the URL of web page you want to analyze as argument to VipsTester class.

Preferences of implementation can be changed also there.

