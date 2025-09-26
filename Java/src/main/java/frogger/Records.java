package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param id   the id of the frogger
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID id) {
        for (FroggerID existing : this.records) {
            if (existing.equals(id)) {
                return false;
            }
        }
        this.records.add(id);
        return true;
    }
}