package lesson9.requests;

import java.util.Optional;

public class ShapeChoiceRequest {
    private final int choice;

    public ShapeChoiceRequest(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }
}
