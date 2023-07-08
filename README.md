# mandelbrot-set

The Mandelbrot set is a widely seen visualization based on complex numbers. 
Consider the sequence defined by the function $z_{n+1} = z_n^2 + c$ where $z_n$ and $c$ are both complex numbers.  
Suppose that we choose $z_0 = 0 + 0i$, then we can plug it into the equation to get $z_1 = (0+0i)^2+c = c$. We can continue following this pattern to find $z_2$, $z_3$, and so on. 
As we do this, what happens to the magnitude of $z_{n+1}$? The answer depends on the value of $c$.

The Mandelbrot set is defined as the set of complex values $c$ for which the magnitude of $z_{n+1}$ remains less than or equal to 2 as $n$ approaches infinity. It is visualized like this: 

![image](https://github.com/ikra-mortoza/mandelbrot-set/assets/108554539/e160f2e7-4963-474b-8581-92582fdac1ef)

Here the horizontal axis represents the real part of a complex number and the vertical axis represents the imaginary part of a complex number. The black areas correspond to complex numbers that are elements of the Mandelbrot set. The rest of the picture is shaded in a colour that depends on the value of $n$ when the magnitude of $z_{n+1}$ becomes greater than 2.

This project replicates a complex number, and then uses it to compute and display a visualization of the Mandelbrot set like the picture above.
