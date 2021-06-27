package behaviouralPatterns.iteratorPattern.social_networks;

import behaviouralPatterns.iteratorPattern.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
