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


Build
-----
```
$ mkdir dest
$ javac -cp "./lib/*" -d ./dest ./src/org/fit/vips/*.java
$
```

Usage
-----

```
$ java -cp "./lib/*:./dest" org.fit.vips.VipsTester <URL>
```

Just pass the URL of web page you want to analyze as argument to VipsTester class.

Preferences of implementation can be changed also there.
