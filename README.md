# Parabola-using-Java-GUI
This Java project is a modular GUI-based parabola plotter that lets users input quadratic coefficients (a, b, c) and visually render the graph. It uses Swing components and custom drawing utilities to create an interactive coordinate plane with labeled axes.
 is is a cool Java project that lets you **draw a parabola** (y = ax² + bx + c) using a graphical interface. You just enter the values of a, b, and c... and boom! Your parabola is ready!

---

##  What It Does??

- Lets you enter your own values of **a**, **b**, and **c**
- Plots the parabola on a nice graph with:
  -  X and Y axis
  -  Grid lines
  -  Labeled numbers
- You can change the values anytime and see the new curve immediately!

---

## 📁 Project Files

Your must be project is inside a package called: `com.parabola.gui`

Here are the File organisation:

com/parabola/gui/

├── MainApp.java 

├── GraphWindow.java  

├── ControlPanel.java  

├── ParabolaPanel.java  

├── ParabolaEquation.java 

├── GraphUtils.java 


---

## How To Run It?

### 1. Create the folders:

Make the folder structure like this:

```bash
mkdir -p com/parabola/gui
```

Then put all the .java files into the com/parabola/gui/ folder.

### 2. Compilation:

Go to the root folder (the one that contains com/) and run:

```bash
javac com/parabola/gui/*.java
```

### 3. Run:

After compiling, just run:

```bash
java com.parabola.gui.MainApp
```









