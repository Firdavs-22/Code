package partTwo.Interface;

public interface UIWidget extends Draggable, Resizeable {
    /*in java class cannot have multiple parent classes but interfaces can*/
    void render();
}