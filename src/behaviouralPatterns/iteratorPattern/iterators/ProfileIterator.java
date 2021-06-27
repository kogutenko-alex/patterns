package behaviouralPatterns.iteratorPattern.iterators;

import behaviouralPatterns.iteratorPattern.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
