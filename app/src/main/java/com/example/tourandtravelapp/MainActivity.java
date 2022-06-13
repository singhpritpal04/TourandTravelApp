package com.example.tourandtravelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rcv = (RecyclerView) findViewById(R.id.reclist2);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);



    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Amritsar");
        ob1.setDesc("Punjab");
        ob1.setImgname(R.drawable.amritsar);
        ob1.setDetails("Amritsar, historically also known as Rāmdāspur and colloquially as Ambarsar, is the second largest city in the Indian state of Punjab, after Ludhiana. It is a major cultural, transportation and economic centre located in the Majha region of Punjab. The city is the administrative headquarters of the Amritsar district. According to the 2011 census, the population of Amritsar was 1,132,761. It is one of the ten Municipal Corporations in the state, and Karamjit Singh Rintu is the current mayor of the city.[5] The city is situated 217 km (135 mi) northwest of state capital Chandigarh, 455 km (283 miles) northwest of New Delhi, the national capital, and 47 km (29.2 miles) northeast of Lahore, Pakistan, with the Indo-Pak Border (Wagah) being only 28 km (17.4 mi) away. Amritsar has been chosen as one of the heritage cities for HRIDAY scheme of the Government of India.[6] Amritsar is home to Harmandir Sahib, popularly known as \"the Golden Temple,\" one of Sikhism's most spiritually significant and most-visited gurudwaras. The city is also known for its wooden chessboards and chess pieces manufacturing industry.");
        ob1.setHotelimg1(R.drawable.ramada);
        ob1.setHotel_names("Ramada");
        ob1.setHotel_details("Near Golden Temple, Amritsar | 1.2 km from Golden Temple");
        ob1.setHotel_numbers("9797555755");
        ob1.setHotelimg2(R.drawable.holidayinn);
        ob1.setHotel_names2("Holiday Inn");
        ob1.setHotel_details2("Holiday Inn Amritsar Ranjit Avenue");
        ob1.setHotel_numbers2("979755755");
        ob1.setRestaurantimg1(R.drawable.haveli_at_amritsar);
        ob1.setRestaurantname("Haveli");
        ob1.setRestaurantaddress("Jalandhar Road, Away from Acet Amritsar");
        ob1.setRestaurantsite("9797555755");
        ob1.setRestaurantimg2(R.drawable.hoppers);
        ob1.setRestaurantname2("Hoppers");
        ob1.setRestaurantaddress2("Ranjit Avenue, Amritsar");
        ob1.setRestaurantsite2("979755755");
        ob1.setPlace1(R.drawable.darbarsahib);
        ob1.setPlacename1("Harimandar Sahib");
        ob1.setPlaceabout1("The definitive top attraction in Amritsar is the Golden Temple, a two-story structure covered in real gold and surrounded by a 5.1-meter-deep manmade lake. But not merely a tourist site, this legendary religious shrine is one of the most sacred places in the world for Sikhs, many of whom make a pilgrimage to the temple at least once in their lifetimes. To enter the Gurdwara complex, where the Golden Temple resides, you\'ll need to cover your hair, remove your shoes, and step through a small stream of running water to cleanse your feet. Then, you'll walk clockwise on the inlaid marble path that flanks the pool, as worshippers chant and bathe in the water. Making your way to the glistening inner sanctum of the temple, where priests chant songs from the Guru Granth Sahib holy text, is just one of many things to do at the Golden Temple. This attraction is home to the world's largest community kitchen, welcoming anyone to sit on the floor and savor a free vegetarian meal with other visitors. It's mesmerizing to see hordes of volunteers chopping onions, peeling garlic, and cooking huge vats of lentils and roti for up to 100,000 diners every day. You can also see a collection of holy Sikh weapons inside the Akal Takhat (a seat of power inside the Golden Temple complex) and learn more about Sikhism in the Golden Temple Interpretation Centre, tucked beneath the clock-tower entrance of the temple. The Golden Temple is an inspiring place, and one that you can get personally involved with, if you wish. You can volunteer at the Golden Temple Kitchen, and bond with locals as you prepare lunch. You can also sleep at the Golden Temple in one of its pilgrim hostels for up to three nights. Sleeping here gives you easy access to the Golden Temple at sunrise–the best time of day to see the structure shine.");
        ob1.setPlace2(R.drawable.jallianwala_bagh_600);
        ob1.setPlacename2("Jallianwala Bagh");
        ob1.setPlaceabout2("Tucked behind the Golden Temple, tourists will find another important site in Amritsar: Jallianwala Bagh. The public garden memorializes the estimated 1,500 people who were killed or injured when British soldiers were ordered to fire on peaceful protesters who were demanding the release of imprisoned leaders of the Indian Independence Movement in 1919. You can still see bullet holes in the walls that hundreds of victims hid behind in attempt to dodge the gunfire. The memorial site's Martyrs' Gallery displays the portraits of important figures of Indian independence. You can also check out a humbling exhibition on the victims and see an eternal flame.");

            holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Varanasi");
        ob2.setDesc("Uttar Pardesh");
        ob2.setImgname(R.drawable.banaraspotrait);
        ob2.setDetails("Varanasi is a metropolis on the Ganges river in northern India that has a central place in pilgrimage, death, and mourning in the Hindu world.The name Varanasi was officially so revived after 1947, but the city is still widely known as Banaras or Benares , and has been since ancient times also as Kashi.[14][15] Located in the middle-Ganges valley in the southeastern part of the state of Uttar Pradesh, Varanasi lies on the left bank of the river. It is 692 kilometres (430 mi) to the southeast of India's capital New Delhi, 320 kilometres (200 mi) south-east of the state capital, Lucknow, and 121 kilometres (75 mi) east of Allahabad, another Hindu pilgrimage site. Varanasi is one of the world's oldest continually inhabited cities.[16] Kashi, its ancient name, was associated with a kingdom of the same name of 2,500 years ago. The Buddha is recorded in the Pali canon to have given his first sermon, \"The Setting in Motion of the Wheel of Dharma\", at nearby Sarnath in 528 BCE. In the 8th century, Adi Shankara established the worship of Shiva as an official sect of Varanasi. During the Muslim rule during the Middle Ages, the city became an important centre of Hindu devotion, pilgrimage, mysticism and poetry contributing to its cultural importance. Tulsidas wrote his Awadhi language epic, the Ramcharitmanas, a Bhakti movement reworking of the Sanskrit Ramayana, in Varanasi. Several other major figures of the Bhakti movement were born in Varanasi, including Kabir and Ravidas. The city has a syncretic tradition of Muslim artisanship that underpins its tourism.[18][19] In the 16th century, the Mughal emperor Akbar built two large temples dedicated to Shiva and Vishnu in the city. Under the Treaty of Faizabad, the East India Company acquired Benares in 1775, the city later successively becoming a part of the Benares Division in the Ceded and Conquered Provinces, the North-Western Provinces, and the United Provinces, and after India's independence of Uttar Pradesh");
        ob2.setHotelimg1(R.drawable.hotel);
        ob2.setHotel_names("Mahanda");
        ob2.setHotel_details("South Mraket");
        ob2.setHotel_numbers("9797555755");
        ob2.setHotelimg2(R.drawable.hotel2);
        ob2.setHotel_names2("Hotel Sand");
        ob2.setHotel_details2("pishli gali, Varanasi");
        ob2.setHotel_numbers2("979755755");
        ob2.setRestaurantimg1(R.drawable.rest1);
        ob2.setRestaurantname("Sami Foods");
        ob2.setRestaurantaddress("Mandir k pishe aa jana");
        ob2.setRestaurantsite("9797555755");
        ob2.setRestaurantimg2(R.drawable.rest2);
        ob2.setRestaurantname2("Phils and Megs");
        ob2.setRestaurantaddress2("Klyan Nagar, ");
        ob2.setRestaurantsite2("979755755");
        ob2.setPlacename1("Chet Singh Fort");
        ob2.setPlaceabout1("Chet Singh Fort is a cool old fortress built into a ghat along the Ganges River. Built in honor of a local ruler, hundreds of years ago, this impressive fort still stands today. You can take a stroll past it and even take a gander inside if you so choose.");
        ob2.setPlace1(R.drawable.chetsinghfortghat);
        ob2.setPlace2(R.drawable.varanasimustvisit);
        ob2.setPlacename2("Sunrise boat tour on the Ganges.");
        ob2.setPlaceabout2("One of the best things to do in my Varanasi guide is the sunrise boat tour down the infamously polluted Ganges River. There are a countless number of boats and men waiting along the shore, so you have plenty of choice in where and when to start. To give you perspective, we paid 500 rupees / $7.25 USD for a rowboat for four people, for one hour. You can also opt to take a motorized boat tour, which is a little bit cheaper and allows you to see more of the river in the hour you pay for, but you share the boat with others. We chose a manual rowboat to enjoy a private tour and the peace and quiet of not having a motor.");
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Manali");
        ob3.setDesc("Himchal Pardesh");
        ob3.setImgname(R.drawable.manalipotrait);
        ob3.setDetails("One of the most popular hill stations in Himachal, Manali offers the most magnificent views of the Pir Panjal and the Dhauladhar ranges covered with snow for most parts of the year.With the Covid-19 pandemic going on, Manali has evolved to be a place loved by young people looking for longer stays for workation. With ambient cafes, good wifi availability, small eateries and convenient shops, Old Manali is among the favorite neighbourhood for such people. There are many homestays and hostels offering dorm beds for cheap for longer durations. Manali has many trekking options around it, making it a great base for exploring this side of Himalayas. River Beas provides great rafting options in the nearby town of Kullu. Adjoining Parvati river, lies the Parvati Valley with  Kasol, Manikaran, Tosh and small villages attracting travellers for longer stays. Atal Tunnel now allows travellers to reach Sissu within a few hours making Spiti way more accessible. It snows the most in the months of January & February followed by December and March. If you're very lucky, you might find some snow in April. Tourists flock to Rohtang Pass & Solang valley for various adventure activities including skiing, paragliding, horse-riding & zorbing. Rohtang Pass is almost always covered with snow and can often get overcrowded and see traffic jams.");
        ob3.setHotelimg1(R.drawable.hotel4);
        ob3.setHotel_names("Hotel Raddison");
        ob3.setHotel_details("Near Main Chowk");
        ob3.setHotel_numbers("9797555755");
        ob3.setHotelimg2(R.drawable.hotel3);
        ob3.setHotel_names2("Holiday Hotel");
        ob3.setHotel_details2("Holiday Avenue, Main Bazar");
        ob3.setHotel_numbers2("979755755");
        ob3.setRestaurantimg1(R.drawable.rest6);
        ob3.setRestaurantname(" Mount View Restaurant");
        ob3.setRestaurantaddress("Mall Road, Model Town, Siyal, Manali, Himachal Pradesh");
        ob3.setRestaurantsite("9797555755");
        ob3.setRestaurantimg2(R.drawable.rest1);
        ob3.setRestaurantname2("Renaissance Manali");
        ob3.setRestaurantaddress2("Old Manali Road, Near Manu Temple, Manali, Himachal Pradesh");
        ob3.setRestaurantsite2("979755755");
        ob3.setPlacename1("Hadimba Temple, Manali");
        ob3.setPlaceabout1("Also known by the names Hidimba Devi Temple and Dhungari Temple, this ancient shrine was built by Maharaja Bahadur Singh way back in 1553. As the name suggests, the temple is dedicated to Hidimba Devi, wife of Bheema. The wooden architecture of the shrine is very distinct from most Hindu temples you will come across in the country. There’s another shrine dedicated to Hidimba Devi’ son Ghatotkacha in the premises. Surrounded by thick cedar groves and with snow-capped mountains serving as the backdrop, the temple is one of the best places to visit in Manali.");
        ob3.setPlace1(R.drawable.hadimba_temple);
        ob3.setPlace2(R.drawable.solang_valley);
        ob3.setPlacename2("Solang Valley");
        ob3.setPlaceabout2("A mini valley located at about 8400 feet above sea level, Solang Nala is a short drive away from Manali. It is a haven for adventure and sports lovers and while here, you can try your skills on a pair of skis or go for a snowmobile exploration. When the weather warms up, people flock here for zorbing and paragliding. You can also hop onto a cable car and enjoy mesmerizing views of the Himalayas. If you are looking for snow-based activities and sports, winters are the best time to visit while the months of summer are ideal for other adventure sports.");
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Kashmir");
        ob4.setDesc("Jammu & Kashmir");
        ob4.setImgname(R.drawable.kashmirpotrait);
        ob4.setDetails("Kashmir is an epitome of natural beauty, and it is renowned the world over for that. You can soak your senses on the many lakes, gardens and hill stations that attract thousands of tourists every year. Jammu & Kashmir is known for its religious shrines. The state abounds with important pilgrimage sites for people of all religions, whether Hindu, Muslim or Buddhist. There are people who travel from far to pay homage, and others who visit to feast their eyes upon the beauty of some of these ancient structures.");
        ob4.setHotelimg1(R.drawable.hotel);
        ob4.setHotel_names("Gulistan hotel");
        ob4.setHotel_details("Nadon Market");
        ob4.setHotel_numbers("9797555755");
        ob4.setHotelimg2(R.drawable.rest4);
        ob4.setHotel_names2("Holiday Inn");
        ob4.setHotel_details2("Near new Avenue Market");
        ob4.setHotel_numbers2("979755755");
        ob4.setRestaurantimg1(R.drawable.hotel3);
        ob4.setRestaurantname("DDFood");
        ob4.setRestaurantaddress("Gulmarg , kashmir");
        ob4.setRestaurantsite("9797555755");
        ob4.setRestaurantimg2(R.drawable.rest4);
        ob4.setRestaurantname2("Zaika-e-Kashir");
        ob4.setRestaurantaddress2("lal Chowk");
        ob4.setRestaurantsite2("979755755");
        ob4.setPlace1(R.drawable.dal_lake);
        ob4.setPlacename1("Dal Lake");
        ob4.setPlaceabout1("Reckoned to be the pride of Kashmir tourism, Dal Lake is the most popular attraction in Srinagar. Enclosed by splendid Pir Panjal mountains and Mughal Gardens, this must-see place is ideal for family vacationers, honeymoon couples, and even for solo travellers seeking peace. Dal Lake is also one of the best locations in Kashmir for film shooting as it offers some incredible vistas of lofty rolling hills, the distant snow-capped mountains, shikaras cruising quietly and the houseboat standing still with the perfect poise. The canopied Shikaras sailing on the lake are one of the major attractions of Dal Lake. The houseboats on the lake are also the top attraction as the best accommodation option in Srinagar to the tourists. Along with being a popular tourist attraction for nature lovers, Dal Lake even invites the fishing enthusiast with its plethora of fishes along with Carp. In addition to this, the floating vegetable and flower market is a major place to see.");
        ob4.setPlace2(R.drawable.parimahal);
        ob4.setPlacename2("Pari Mahal");
        ob4.setPlaceabout2("Nestled in the Zabarwan Mountain, Pari Mahal is amongst the top tourist places to visit in Srinagar. Once the resident of Dara Shikoh, the Mughal Prince in 1600s, Pari Mahal or the Abode of Fairies is adorned with a seven-terraced garden that has a variety of flowering plants, trees, and shrubs for the visitors to see. The palace that was built to be used as a residence and a library for Dara Shikoh was further used as an observatory to teach astronomy and astrology. In the night, the entire mahal gleams with light and its reflection can be seen on Dal Lake. Dara Sikoh is said to have dedicated this garden to his Sufi teacher, Mullah Shah. ");
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("Agra");
        ob5.setDesc("Uttar Pardesh");
        ob5.setImgname(R.drawable.tajamahal);
        ob5.setDetails("Located on the banks of River Yamuna in Uttar Pradesh, Agra is a popular tourist destination as it is home to one of the 7 wonders of the world, the Taj Mahal. It is a sneak peek into the architectural history and legacy of the Mughal empire with two other UNESCO World Heritage Sites Agra Fort and Fatehpur Sikri. History, architecture, romance all together create the magic of Agra, and hence, makes for a must-visit for anyone living in or visiting India.Agra is one of the most populous cities in Uttar Pradesh and 24th most populous city in India. With its long and rich history, it is no wonder that Agra forms part of the popular Golden Triangle Circuit for tourists along with Delhi and Jaipur. It is also a part of the Uttar Pradesh Heritage Arc including Varanasi and Lucknow. History fanatics and architecture buffs are sure to have a ball here with the sheer expanse of the Mughal art and culture on display. Apart from its monuments, Agra has some exciting stuff for foodies. It is as famous for its Petha (a sweet made from pumpkin and flavoured with rose water and saffron) as it is for the Taj Mahal. Agra is also well known for its marble artefacts which are best bought in the Sadar Bazaar or Kinaari Bazaar area. Agra is mostly visited on a one-day trip from New Delhi or other nearby cities in Uttar Pradesh but is totally worth it. Be prepared to be astounded, amazed, inspired and thrilled. However, be a little cautious about conmen in the guise of unofficial tour guides and fake handicrafts");
        ob5.setHotelimg1(R.drawable.hotel2);
        ob5.setHotel_names("Ramada");
        ob5.setHotel_details("1.2 km form taj mahal in east");
        ob5.setHotel_numbers("9797555755");
        ob5.setHotelimg2(R.drawable.hotel4);
        ob5.setHotel_names2("Holiday Inn");
        ob5.setHotel_details2("Nar Fatehpur Sikri");
        ob5.setHotel_numbers2("979755755");
        ob5.setRestaurantimg1(R.drawable.rest2);
        ob5.setRestaurantname("KHana Khajana");
        ob5.setRestaurantaddress("Haldi Chowk");
        ob5.setRestaurantsite("9797555755");
        ob5.setRestaurantimg2(R.drawable.rest1);
        ob5.setRestaurantname2("Hoppers");
        ob5.setRestaurantaddress2("Ranjit Avenue, Agra");
        ob5.setRestaurantsite2("979755755");
        ob5.setPlace1(R.drawable.tajamahal);
        ob5.setPlacename1("Taj Mahal");
        ob5.setPlaceabout1("One of the seven wonders of the world, Taj Mahal is located on the banks of River Yamuna in Agra. It was built by the Mughal Emperor Shah Jahan as a memorial for his third wife, Mumtaz Mahal. It also houses the tomb of Shah Jahan himself. Constructed entirely out of white marble in the 17th century, Taj Mahal is one of the most beautiful monuments in the world. Every year visitors numbering more than the entire population of Agra pass through the magnificent gates to catch a glimpse of this breathtaking monument!");
        ob5.setPlace2(R.drawable.fs);
        ob5.setPlacename2("Fatehpur Sikri");
        ob5.setPlaceabout2("Located at a distance of 40km from Agra, Fatehpur Sikri is a town in the Agra district and a famous tourist attraction. A city predominantly made of red sandstone, Fatehpur Sikri was founded in 1571 century by Mughal Emperor Akbar. It is essentially a fortified city built by the king and had been the capital of his Empire for fifteen years. Now a UNESCO world heritage site, it is home to Jodha Bai's Palace, Jama Mosque, Buland Darwaza, and Tomb of Salim Chisti among many other famous monuments. Derived from Arab and central Asian tent encampments, the Imperial Complex is a work of pavilions arranged in formal geometry on a piece of land. ");

        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("New Delhi");
        ob6.setDesc("New Delhi");
        ob6.setImgname(R.drawable.delhi_potrait);
        ob6.setDetails("Delhi, for all the right reasons, is the national capital of incredible India. Synonymous with diversity, Delhi has always been the epicentre of all activities in India which is reflected in its tourism. Right from the time of Pandavas, it has served as a major strategic and cultural hub of the country and rightly so, today it’s an exhibition of the history of India. Travelling in Delhi isn’t just limited to history but it’s a step to take past and present hand in hand. Blended with modern advancements, Delhi is the modern-day city of Troy. The amalgamation of all religion and spiritual hubs of different faiths coexisting together in peace is the testament of the unity in diversity. Delhi offers numerous tourist attractions ranging from monuments, museums, shrines to modern day markets. Exploring the city is like witnessing a mini-India, with Delhi Tourism being a reflection of rich culture of India.");
        ob6.setHotelimg1(R.drawable.hotel2);
        ob6.setHotel_names("The Royal Plaza");
        ob6.setHotel_details("1.2 km to city center");
        ob6.setHotel_numbers("9797555755");
        ob6.setHotelimg2(R.drawable.hotel3);
        ob6.setHotel_names2("The Roseate");
        ob6.setHotel_details2("5.6 km to the city center");
        ob6.setHotel_numbers2("979755755");
        ob6.setRestaurantimg1(R.drawable.rest4);
        ob6.setRestaurantname("Tamra Restaurant");
        ob6.setRestaurantaddress("New Delhi, Delhi");
        ob6.setRestaurantsite("9797555755");
        ob6.setRestaurantimg2(R.drawable.rest3);
        ob6.setRestaurantname2("Warehouse Cafe");
        ob6.setRestaurantaddress2("Connaught place");
        ob6.setRestaurantsite2("979755755");
        ob6.setPlace1(R.drawable.red_fort);
        ob6.setPlacename1("Red Fort");
        ob6.setPlaceabout1("Red Fort symbolizes the era of Mughal rule in India. The Fort, built in 1638, is a magnificent monument that captivates your attention and exhibits the show of architectural splendor of Mughals. The 33m high walls of Red Fort are yet another special feature of the fort.");
        ob6.setPlace2(R.drawable.gbs);
        ob6.setPlacename2("Gurudwara Bangla Sahib");
        ob6.setPlaceabout2("Gurudwara Bangla Sahib holds special significance for Sikhs because of its relation with the eighth Sikh Guru, Guru Har Krishan who stayed here to cure thousands suffering from cholera and smallpox epidemic. The ‘Sarover’ or ‘lake’ inside the gurudwara is also worth a visit for its serenity and importance. In a recent survey, Gurudwara Bangla Sahib was ranked as the best place of pilgrimage in Delhi.");
        holder.add(ob6);




        return holder;
    }


}
