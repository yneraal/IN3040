class Oblig1 {
    public static void main(String[] args) {
        TestCode testCode = new TestCode();
        switch (args.length > 0 ? args[0] : "") {
            case "1":
                testCode.runProgram1();
                return;
            case "2":
                testCode.runProgram2();
                return;
            case "3":
                testCode.runProgram3();
                return;
            case "4":
                testCode.runProgram4();
                return;
            case "all":
                testCode.runAll();
                return;
            default:
                System.out.println("USAGE: java Oblig1 1|2|3|4|all");
                return;
        }
    }
}


class TestCode {
// Create the AST based on testing code 1
// This code is just to help you understand how to create an AST
    void runProgram1() {
            Grid grid = new Grid(new NumberExp(64), new NumberExp(64));
            Start start = new Start(new NumberExp(23), new NumberExp(30));
            statements.add(new Move(Direction.west, new NumberExp(15)));
            statements.add(new Move(Direction.south, new NumberExp(15)));
            //statements.add(new Move(Direction.east, new NumberExp(+ 2 3)));
            //statements.add(new Move(Direction.north, new NumberExp(+ 17 20)));
            Program program;
       // TODO Fill in rest of the code

       // TODO Run the interpreter
            program.interpret();
}

   // same as runProgram1 but with the AST based on the other example programs
   void runProgram2() {
       Grid grid = new Grid(new NumberExp(64), new NumberExp(64));
       int i = 5;
       int j = 3;
       Start start = new Start(new NumberExp(23), new NumberExp(6));
       //statements.add(new Move(Direction.north, new NumberExp(* 3 i)));
       //statements.add(new Move(Direction.east, new NumberExp(15)));
       //statements.add(new Move(Direction.south, new NumberExp(- 12 i j)));
       //statements.add(new Move(Direction.west, new NumberExp(+(* 2 i)(* 3 j) 1)));
       Program program;
  // TODO Fill in rest of the code

  // TODO Run the interpreter
       program.interpret();
}

   void runProgram3() {
       Grid grid = new Grid(new NumberExp(64), new NumberExp(64));
       int i = 5;
       int j = 3;
       Start start = new Start(new NumberExp(23), new NumberExp(6))
       //statements.add(new Move(Direction.north, new NumberExp(* 3 i)));
       statements.add(new Move(Direction.west, new NumberExp(15)));
       statements.add(new Move(Direction.east, new NumberExp(4)));
       //statements.add(new Move(Direction.south, new NumberExp(loop)));
       Program program;
  // TODO Fill in rest of the code

  // TODO Run the interpreter
       program.interpret();
}

   void runProgram4() {
       Grid grid = new Grid(new NumberExp(64), new NumberExp(64));
       int i = 8;
       Start start = new Start(new NumberExp(1), new NumberExp(1))
       //statements.add(new Move(Direction.north, new NumberExp(loop)));

       Program program;
// TODO Fill in rest of the code

// TODO Run the interpreter
   program.interpret();
}

   void runAll() {
       runProgram1();
       runProgram2();
       runProgram3();
       runProgram4();
   }
}


interface Robol {
    void interpret();
}

class Program implements Robol {
    Grid grid;
    Robot robot;
    public Program(Grid grid, Robot robot) {
        this.grid = grid;
        this.robot = robot; }
    public void interpret() {
        robot.interpret();
    }
}

class Robot implements Robol {
    public void interpret() {
       //TODO write interpreter code for the robot here
   }
}

abstract class Statement implements Robol {
    public abstract void interpret();
}

class Assignment extends Statement { public void interpret() {
       // TODO write interpreter code here
   }
}

class Loop extends Statement {
    List<Statement> statements;
    BoolExp condition;
    public void interpret() {
       //TODO write interpreter code here
   }
}

abstract class Expression { ... }

abstract class BoolExp extends Expression {
    protected Expression left;
    protected Expression right;
    ...
}
