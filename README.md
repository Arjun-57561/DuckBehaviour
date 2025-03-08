# Duck Behavior Project
-- Directly Committed from GIT BASH --

## 📖 Project Description
This Java project implements the **Strategy Pattern** to demonstrate different duck behaviors. The system allows users to:

- Create different types of ducks (MallardDuck, RedheadDuck, RubberDuck, DecoyDuck).
- Assign and modify flying behaviors dynamically.
- Assign and modify swimming behaviors dynamically.
- Display each duck's behavior (whether it flies, swims, or floats).
- Follow object-oriented design principles and coding guidelines.

## 📂 Project Structure
```
DuckBehavior/
│── Main.java            # Entry point of the program
│── Duck.java            # Abstract class representing a duck
│── FlyBehavior.java     # Interface for flying behavior
│── Fly.java             # Implements flying behavior
│── NotFly.java          # Implements non-flying behavior
│── SwimBehavior.java    # Interface for swimming behavior
│── Swim.java            # Implements swimming behavior
│── Float.java           # Implements floating behavior
│── Drown.java           # Implements drowning behavior
│── MallardDuck.java     # MallardDuck class with specific behavior
│── RedheadDuck.java     # RedheadDuck class with specific behavior
│── RubberDuck.java      # RubberDuck class with specific behavior
│── DecoyDuck.java       # DecoyDuck class with specific behavior
│── README.md           # Project documentation and instructions
```

## ⚡ Functions & Methods
| File               | Function       | Description |
|--------------------|---------------|-------------|
| Duck.java         | `display()`    | Displays the type of duck |
|                   | `performFly()` | Calls the duck's flying behavior |
|                   | `performSwim()` | Calls the duck's swimming behavior |
| Fly.java          | `fly()`        | Implements flying behavior |
| NotFly.java       | `fly()`        | Implements non-flying behavior |
| Swim.java         | `swim()`       | Implements swimming behavior |
| Float.java        | `swim()`       | Implements floating behavior |
| Drown.java        | `swim()`       | Implements drowning behavior |

## 🛠️ How to Run:
1. Open **Command Prompt** and navigate to your project folder using:
   ```bash
   cd path_to_your_folder
   ```
2. Compile all Java files:
   ```bash
   javac *.java
   ```
3. Run the program:
   ```bash
   java Main
   ```
4. Observe the different behaviors of the ducks.

## 📌 Example Output
```
===== Duck Behavior System =====
Mallard Duck: Flies and Swims
Redhead Duck: Flies and Swims
Rubber Duck: Doesn't Fly, but Floats
Decoy Duck: Doesn't Fly, Doesn't Swim
```

## 📜 Contributors
Arjun - [GitHub Profile](https://github.com/Arjun-57561)

## 📄 License
This project is open-source and free to use.
