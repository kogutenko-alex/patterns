package structurePatterns.facadePattern;

import structurePatterns.facadePattern.facade.VideoConversionFacade;

import java.io.File;

public class facadePatternStart {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
