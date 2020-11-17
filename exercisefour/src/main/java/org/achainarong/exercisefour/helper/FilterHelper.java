package org.achainarong.exercisefour.helper;

import org.achainarong.exercisefour.enums.FilterType;
import org.achainarong.exercisefour.filter.*;
import java.awt.image.*;

public class FilterHelper {

    // buffered image is a hack for FadingFilter
    public static ImageFilter getimageFilterByFilterType(FilterType filterType) {
        return switch (filterType) {
            case Alpha -> new AlphaFilter();
            case Blue -> new BlueFilter();
            case DarkLight -> new DarkLightFilter();
            case ExchangeRedWithBlue -> new ExchangeRedWithBlueFilter();
            case Green -> new GreenFilter();
            case GreyScale -> new GreyScaleFilter();
            case LighterBlue -> new LighterBlueFilter();
            case Monochrome -> new MonochromeFilter();
            case Red -> new RedFilter();
            case Invert -> new InvertFilter();
            case Part -> new PartFilter();
            case ImageNoise -> new ImageNoiseFilter();
            default -> throw new IllegalArgumentException(
                    "No Filter With this type: " + filterType.toString() + " found!");
        };
    }
}
