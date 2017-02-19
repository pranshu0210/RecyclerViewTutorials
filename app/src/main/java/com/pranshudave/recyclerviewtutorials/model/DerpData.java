package com.pranshudave.recyclerviewtutorials.model;

import com.pranshudave.recyclerviewtutorials.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pranshu on 18/2/17.
 */

public class DerpData {

    //Mimic data that might be received from server

    private static final String[] titles = {"Nothingness cannot be defined",
            "Time is like a river made of the events which happen, and a violent stream; " +
                    "for as soon as a thing has been seen, it is carried away and another comes in its palce, " +
                    "and this will be carried away too",
            "But when I know that the glass is already broken, every minute with it is precious. ",
            "For me, it is far better to grasp the Universe as it really is than to persist in delusion, " +
                    "however satisfying and reassuring",
            "The seeker after the truth is not one who studies the writings of the ancients and, " +
                    "following his natural disposition, puts his trust in them, " +
                    "but rather one who suspects his faith in them and questions what he gathers from them, " +
                    "the one who submits to argument and demonstration and not to the sayings of a human being " +
                    "whose nature is fraught with all kinds of imperfections and deficiency",
            "You must take personal responsibility. You cannot change the circumstances, the seasons, " +
                    "or the wind, but you can change yourself. That is something you have charge of."};

    private static final String[] subTitles = {"Brue Lee",
            "Marcus Aurelius",
            "Meng Tzu",
            "Aiah Chah",
            "Carl Sagan",
            "Athazen",
            "Jim Rohn"
    };

    private static final int jeon = R.drawable.ic_tonality_black_36dp;

    private static final int[] icons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add, android.R.drawable.ic_menu_delete};

    public static List<ListItem> getListData() {


        List<ListItem> data = new ArrayList<>();

        //Repeat 4 times, so that we have enough data to demostrate a scrollable recyclerView
        for (int x = 0; x < 4; x++) {
            //create listItem with dummy data, then add them to our list

            for (int i = 0; i < titles.length && i < icons.length; i++) {
                ListItem item = new ListItem();
                item.setImageResId(icons[i]);
                item.setTitle(titles[i]);
                item.setSubtitle(subTitles[i]);
                data.add(item);
            }
        }
        return data;
    }
}
