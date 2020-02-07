package com.example.mylistanime;

import java.util.ArrayList;

public class AnimeData  {
    public static String[][] data = new String[][]{
            {"One Punch Man","J.C.Staff","https://cdn.myanimelist.net/images/anime/1805/99571.jpg","The second season of One Punch Man.","Action, Sci-Fi, Comedy, Parody, Super Power, Supernatural, Seinen"},
            {"Shingeki no Kyojin Season 3 Part 2","Wit Studio","https://cdn.myanimelist.net/images/anime/1517/100633.jpg","The second part of the third season of Shingeki no Kyojin.","Action, Military, Mystery, Super Power, Drama, Fantasy, Shounen"},
            {"One Piece","Toei Animation","https://cdn.myanimelist.net/images/anime/6/73245.jpg","Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and execution of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece—which promises an unlimited amount of riches and fame—and quite possibly the pinnacle of glory and the title of the Pirate King.\n" +
                    "\n" +
                    "Enter Monkey D. Luffy, a 17-year-old boy who defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate ransacking villages for fun, Luffy’s reason for being a pirate is one of pure wonder: the thought of an exciting adventure that leads him to intriguing people and ultimately, the promised treasure. Following in the footsteps of his childhood hero, Luffy and his crew travel across the Grand Line, experiencing crazy adventures, unveiling dark mysteries and battling strong enemies, all in order to reach the most coveted of all fortunes—One Piece.","Action, Adventure, Comedy, Super Power, Drama, Fantasy, Shounen"},
            {"5-toubun no Hanayome","Tezuka Productions","https://cdn.myanimelist.net/images/anime/1819/97947.jpg","Fuutarou Uesugi is an ace high school student, but leads an otherwise tough life. His standoffish personality and reclusive nature have left him friendless, and his father is debt-ridden, forcing his family to scrape by.\n" +
                    "\n" +
                    "One day during his lunch break, Uesugi argues with a female transfer student who has claimed \"his seat,\" leading both of them to dislike each other. That same day, he is presented with a golden opportunity to clear his family's debt: a private tutoring gig for a wealthy family's daughter, with a wage of five times the market price. He accepts the proposal, but is horrified to discover that the client, Itsuki Nakano, is the girl he confronted earlier! \n" +
                    "\n" +
                    "After unsuccessfully trying to get back on Itsuki's good side, Uesugi finds out that his problems don't end there: Itsuki is actually a quintuplet, so in addition to her, he must also tutor her sisters—Miku, Yotsuba, Nino, and Ichika—who, despite the very real threat of flunking, want nothing to do with a tutor. However, his family's livelihood is on the line so Uesugi pushes on, adamant in his resolve to rid the sisters of their detest for studying and successfully lead them to graduation.","Harem, Comedy, Romance, School, Shounen"},
            {"Kimetsu no Yaiba","ufotable","https://cdn.myanimelist.net/images/anime/1286/99889.jpg","Since ancient times, rumors have abounded of man-eating demons lurking in the woods. Because of this, the local townsfolk never venture outside at night. Legend has it that a demon slayer also roams the night, hunting down these bloodthirsty demons. For young Tanjirou, these rumors will soon to become his harsh reality...\n" +
                    "\n" +
                    "Ever since the death of his father, Tanjirou has taken it upon himself to support his family. Although their lives may be hardened by tragedy, they've found happiness. But that ephemeral warmth is shattered one day when Tanjirou finds his family slaughtered and the lone survivor, his sister Nezuko, turned into a demon. To his surprise, however, Nezuko still shows signs of human emotion and thought...\n" +
                    "\n" +
                    "Thus begins Tanjirou's quest to fight demons and turn his sister human again.\n" +
                    "\n" +
                    "(Source: VIZ Media)","Action, Demons, Historical, Shounen, Supernatural\n"},
            {"Isekai Quartet","PuYUKAI","https://cdn.myanimelist.net/images/anime/1965/99667.jpg","A mysterious switch appeared one day. Upon pressing it, they were sent to a different alternative world!! There are also characters from other alternative worlds gathered together...!?","Comedy, Parody, Fantasy"},
            {"Kenja no Mago","Silver Link.","https://cdn.myanimelist.net/images/anime/1261/100452.jpg","A young man who had surely died in an accident, was reborn in another world as a baby! After that, he was picked up by the patriot hero \"Sage\" Merlin Wolford and was given the name Shin. He was raised as a grandson by Merlin and soaked up Merlin's teachings, earning him some shocking powers; however, when he became 15, his grandfather Merlin said, \"I forgot to teach him common sense!\"\n" +
                    "\n" +
                    "An \"abnormal\" boy's unconventional other world fantasy life starts here!\n" +
                    "\n" +
                    "(Source: Translated official synopsis)","Action, Comedy, Magic, Fantasy"},
            {"Fruits Basket (2019)","TMS Entertainment","https://cdn.myanimelist.net/images/anime/1447/99827.jpg","Tooru Honda has always been fascinated by the story of the Chinese Zodiac that her beloved mother told her as a child. However, a sudden family tragedy changes her life, and subsequent circumstances leave her all alone. Tooru is now forced to live in a tent, but little does she know that her temporary home resides on the private property of the esteemed Souma family. Stumbling upon their home one day, she encounters Shigure, an older Souma cousin, and Yuki, the \"prince\" of her school. Tooru explains that she lives nearby, but the Soumas eventually discover her well-kept secret of being homeless when they see her walking back to her tent one night.\n" +
                    "\n" +
                    "Things start to look up for Tooru as they kindly offer to take her in after hearing about her situation. But soon after, she is caught up in a fight between Yuki and his hot-tempered cousin, Kyou. While trying to stop them, she learns that the Souma family has a well-kept secret of their own: whenever they are hugged by a member of the opposite sex, they transform into the animals of the Chinese Zodiac.\n" +
                    "\n" +
                    "With this new revelation, Tooru will find that living with the Soumas is an unexpected adventure filled with laughter and romance.\n" +
                    "\n" +
                    "[Written by MAL Rewrite]","Slice of Life, Comedy, Drama, Romance, Fantasy, Shoujo"}

    };
    public static ArrayList<Anime> getListData(){
        Anime anime = null;
        ArrayList<Anime> list = new ArrayList<>();
        for (String[] aData : data) {
            anime = new Anime();
            anime.setName(aData[0]);
            anime.setRemarks(aData[1]);
            anime.setPhoto(aData[2]);
            anime.setDesc(aData[3]);
            anime.setGenre(aData[4]);

            list.add(anime);
        }

        return list;
    }
}
