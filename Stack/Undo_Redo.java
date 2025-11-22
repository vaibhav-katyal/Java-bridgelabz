
import java.util.Stack;


class UndoRedo{
    Stack<String> undo = new Stack<>();
    Stack<String> redo = new Stack<>();

    void doAction(String action){
        undo.push(action);
        redo.clear();
    }

    void undoAction(){
        if(!undo.isEmpty()){
            String last = undo.pop();
            redo.push(last);
            System.out.println("Undoed operation: " + last);
        }
    }

    void redoAction(){
        if(!redo.isEmpty()){
            String last = redo.pop();
            undo.push(last);
            System.out.println("Redoded operation: " + last);
        }
    }
}


public class Undo_Redo{
    public static void main(String[] args) {
        UndoRedo ur = new UndoRedo();
        ur.doAction("Operation A");
        ur.doAction("Operation B");
        ur.doAction("Operation C");
        ur.doAction("Operation D");
        
        ur.undoAction();
        ur.undoAction();

        ur.redoAction();
        ur.undoAction();
    }
}