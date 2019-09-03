-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2019 at 12:39 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fortheby`
--

-- --------------------------------------------------------

--
-- Table structure for table `auctions`
--

CREATE TABLE `auctions` (
  `auction_id` int(10) NOT NULL,
  `title` varchar(254) NOT NULL DEFAULT ' ',
  `location` varchar(254) NOT NULL DEFAULT ' ',
  `date` date NOT NULL,
  `auction_lot` int(10) NOT NULL DEFAULT '0',
  `period` varchar(254) NOT NULL DEFAULT ' '
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `auctions`
--

INSERT INTO `auctions` (`auction_id`, `title`, `location`, `date`, `auction_lot`, `period`) VALUES
(1, 'Traditionally And Culturally Rich Paintings ', 'London', '2019-05-22', 100, 'Morning'),
(2, 'Natural Beauty', 'Paris', '2019-05-22', 102, 'Evening'),
(3, 'Handicrafts', 'London', '2019-05-22', 103, 'Evening');

-- --------------------------------------------------------

--
-- Table structure for table `biddings`
--

CREATE TABLE `biddings` (
  `bid_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL DEFAULT '0',
  `item_lot` int(10) NOT NULL DEFAULT '0',
  `bid_amount` int(10) NOT NULL DEFAULT '0',
  `bid_status` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `biddings`
--

INSERT INTO `biddings` (`bid_id`, `user_id`, `item_lot`, `bid_amount`, `bid_status`) VALUES
(1, 5, 20000005, 25000, 1),
(2, 3, 20000002, 16000, 1),
(4, 5, 20000006, 280000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `cat_id` int(10) NOT NULL,
  `cat_name` varchar(254) NOT NULL DEFAULT ' ',
  `image` varchar(65000) NOT NULL DEFAULT ' '
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`cat_id`, `cat_name`, `image`) VALUES
(1, 'Carvings', 'carving.jpg'),
(2, 'Drawings', 'drawing3.jpg'),
(3, 'Paintings', 'oldpaint1.jpg'),
(4, 'Photographic Images', 'photo2.jpg'),
(5, 'Sculptures', 'sculp.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE `contacts` (
  `contact_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL DEFAULT '0',
  `title` varchar(254) NOT NULL DEFAULT ' ',
  `description` varchar(4000) NOT NULL DEFAULT ' ',
  `post_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `reply_status` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`contact_id`, `user_id`, `title`, `description`, `post_date`, `reply_status`) VALUES
(1, 2, 'Password', 'I wanted you to update my password as i have forgotton it.', '2019-04-26 15:10:39', 1),
(2, 4, 'Hello', 'Thank you so much for registering me in the website. I became very helpful for me to get the resonable price for my items.', '2019-04-26 16:10:32', 1),
(3, 2, 'Thank you', 'Thank you so much for changing my password', '2019-04-26 17:39:22', 1),
(5, 5, 'Happy', 'I am very happy on getting all the wonderful items during the auction', '2019-04-26 17:57:04', 1),
(6, 5, 'Regarding category', 'I cannot find any items belonging to carvings', '2019-04-27 15:09:29', 1);

-- --------------------------------------------------------

--
-- Table structure for table `interest_forms`
--

CREATE TABLE `interest_forms` (
  `form_id` int(10) NOT NULL,
  `first_name` varchar(100) NOT NULL DEFAULT ' ',
  `last_name` varchar(100) NOT NULL DEFAULT ' ',
  `gender` varchar(10) NOT NULL DEFAULT ' ',
  `contact_no` varchar(20) NOT NULL DEFAULT ' ',
  `profession` varchar(20) NOT NULL DEFAULT ' ',
  `user_type_id` int(10) NOT NULL DEFAULT '0',
  `acc_no` varchar(20) NOT NULL DEFAULT ' ',
  `sort_no` varchar(20) NOT NULL DEFAULT ' ',
  `interest` varchar(40000) NOT NULL DEFAULT ' ',
  `email` varchar(100) NOT NULL DEFAULT ' ',
  `status` int(2) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `interest_forms`
--

INSERT INTO `interest_forms` (`form_id`, `first_name`, `last_name`, `gender`, `contact_no`, `profession`, `user_type_id`, `acc_no`, `sort_no`, `interest`, `email`, `status`) VALUES
(1, 'Sekiya', 'Shakya', 'Female', '1238678590', 'Architect', 3, '1234567890', '12-23-34', 'I want to become a seller in the Fortheby Auction House to sell the architect that I have made on modern buildings', ' sekiya@gmail.com', 1),
(2, 'Sudishna', 'Shakya', 'Female', '1234567890', 'Doctor', 2, '2345678901', '23-34-45', 'I am mostly interested in wooden carvings and I heard  many carvings are auctioned in Fortheby\'s. So I want to be a buyer. ', 'sudi@gmail.com', 1),
(3, 'Mila', 'Bajracharya', 'Female', '3456789012', 'Community Developer', 3, '3456789012', '34-45-56', 'I have an ancient painting of the Royal Family of our country Nepal  and i would want to sell the item', 'mil@gmail.com', 1),
(4, 'Manik ', 'Ratna Shakya', 'Male', '4567890123', 'Retired Business', 2, '3210987654', '45-56-67', 'I have heard that you sell ancient paintings and i am very fond of them. I want to become a buyer in your Fortheby\'s Auction house.', 'manik@gmail.com', 1),
(6, 'Sanu ', 'Bajracharya', 'Female', '6789012345', 'Retired Scientist', 3, '6789012345', '56-67-78', 'I have some ancient painting that I want to sell through Fortheby\'s Auction House', 'sanu@gmail.com', 1),
(7, 'Anishma', 'Tuladhar', 'Female', '56789012345', 'Social Server', 3, '0987654321', '09-98-87', 'I want to be a seller because i have a lot of old antique items', 'anishma@gmail.com', 1),
(8, 'Runo', 'Watson', 'Female', '9012345678', 'Bank Manager', 2, '3456789012', '67-78-89', 'I am keen of buying some good waitings from Fortheby', 'runo@gmail.com', 0),
(9, 'Diwas ', 'Bajracharya', 'Male', '6789012345', 'Retired Broker', 2, '9807556433', '09-98-87', 'I am seeking for good quality of paintings. That i why i want to become a buyer in your auction house', 'diwas@gmail.com', 0),
(10, 'Rajin', 'Bajracharya', 'Male', '7465739295', 'Restaurant Manager', 2, '5365576879', '87-76-54', 'I am interested in buying some beautiful photographic images for the our restaurant. So i would want to become a buyer', 'rajin@gmail.com', 0);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_lot` int(10) NOT NULL,
  `cat_id` int(10) NOT NULL DEFAULT '0',
  `item_name` varchar(254) NOT NULL DEFAULT ' ',
  `artist_name` varchar(254) NOT NULL DEFAULT ' ',
  `created_year` varchar(254) NOT NULL DEFAULT ' ',
  `classify` varchar(254) NOT NULL DEFAULT ' ',
  `description` varchar(2000) NOT NULL DEFAULT ' ',
  `auction_date` date NOT NULL,
  `price` int(11) NOT NULL DEFAULT '0',
  `medium` varchar(254) NOT NULL DEFAULT ' ',
  `framed` varchar(254) NOT NULL DEFAULT ' ',
  `dimension` varchar(254) NOT NULL DEFAULT ' ',
  `image_type` varchar(254) NOT NULL DEFAULT ' ',
  `material` varchar(254) NOT NULL DEFAULT ' ',
  `weight` varchar(254) NOT NULL DEFAULT ' ',
  `seller_id` int(10) NOT NULL DEFAULT '0',
  `image` varchar(254) NOT NULL DEFAULT ' ',
  `status` int(10) NOT NULL DEFAULT '0',
  `sold_status` int(10) NOT NULL DEFAULT '0',
  `sold_price` decimal(10,0) NOT NULL DEFAULT '0',
  `after_commission` decimal(10,0) NOT NULL DEFAULT '0',
  `buyer_id` int(10) NOT NULL DEFAULT '0',
  `auction_id` int(10) NOT NULL DEFAULT '0',
  `auction_status` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_lot`, `cat_id`, `item_name`, `artist_name`, `created_year`, `classify`, `description`, `auction_date`, `price`, `medium`, `framed`, `dimension`, `image_type`, `material`, `weight`, `seller_id`, `image`, `status`, `sold_status`, `sold_price`, `after_commission`, `buyer_id`, `auction_id`, `auction_status`) VALUES
(20000001, 1, 'Purano Ghyal', 'Nepal Wood Foundation', '2014', 'Other', 'The \"Purano ghyal\" is the demo of the windows that represented the homes of ancient Nepal. During ancient age, almost all the homes looked like that.Handcarved on wood and finished with synthetic coating, the traditional window provides a view to the windows that are used on bahal Ã¢??housesÃ¢?? around the ancient city of Kathmandu valley. ', '2019-05-22', 12000, 'none', 'none', '200 by 160  cm', 'none', 'Original Wood from Nepal', '0.52 kg', 6, 'windowcarv.jpg', 0, 1, '20000', '3000', 5, 3, 1),
(20000002, 1, 'The \"Om\" Symbol', 'Nepal Wood Foundation', '2015', 'Other', 'The \"Om\" is the symbolic representation od peace and power in the Hindu and the Buddhist Religion. It hold a great significant in the Hindu and the Buddhist Religion. It is said to protect the people from negative power and energy. The word \"Om\" is also used in the yoga as it brings piece to the people hearing or pronouncing it. Beautiful om symbol carved from wood\r\nOm Mani PADME Hum, the mantra of the Himalayas carved in Nepalese characters of wood. Beautiful hand work from Nepal. A metal eyelet is attached to the back for convenient hanging.\r\nAn extraordinary wall decoration and meditation object.\r\nSince the OM is handmade, each piece is unique!', '2019-05-22', 12000, 'none', 'none', '11  by 9.5 cm', 'none', 'Original Wood from Nepal', '0.20', 2, 'omcarv.jpg', 0, 0, '0', '0', 0, 0, 0),
(20000003, 2, 'RINALDO AND ARMIDA', 'FranÃ§ois Boucher', '1703 - 1770', 'Figure', 'The present drawing, a wonderfully energetic and extremely well preserved example of Boucher\'s fully formed mature style, must date from much later in the artist\'s career.  Alastair Laing has kindly proposed that it (and also a variant drawing in reverse, in the Kupferstichkabinett, Berlin3) may be a design for the last in a set of eight Beauvais tapestries of the Aventures de Renaud et Armide that Oudry and Boucher proposed in October 1751.  Such a dating is also plausible on stylistic grounds. The tapestry project was never realized, and its only tangible product was Boucher\'s cartoon for Renaud endormi, a tapestry produced in the following year as part of the set of Fragments dâ??OpÃ©ra.', '2019-05-22', 15000, 'Pen and brown ink and and brown and red wash over black chalk within black ink framing lines', 'Minimalist Black Metallic Frame ', '300 by 250 cm', 'none', 'none', 'none', 4, 'drawing2.jpeg', 0, 0, '0', '0', 0, 0, 0),
(20000004, 2, 'ALLEGORY OF THE ELEVATION OF CARDINAL DEACON ODDONE COLONNA TO THE PAPAL CHAIR AS POPE MARTIN V', 'Benedetto Luti', '1666 - 1724', 'Figure', 'At the top of the composition, floating in the air, is an allegorical figure of the sacred college of the Council of Constance, which unanimously elected Colonna Pope, pointing to the Cathedra Petri, visible in the upper right corner.  Another female allegorical figure, holding a dish, kneels before the future Pope presenting to him the keys of St. Peter.  In the lower right of the composition are the theological Virtues, with Charity in the foreground.  Also very prominent in this part of the composition is another allegorical female, seated on a lion and holding a column, the emblem of the Colonna family.  To the left are the four cardinal Virtues.  Some of these figures are more clearly developed in the painting, with the addition of an angel holding an olive branch and pursuing Heresy and Schism, a tribute to Martin V, who ended the great schism in the Church. ', '2019-05-22', 15000, 'Pen and brown ink and wash over black and red chalk, heightened with white, on six joined sheets of paper, ', 'Minimalist Black Metallic Frame ', '300 by 200 cm', 'none', 'none', 'none', 4, 'drawing1.jpeg', 0, 0, '0', '0', 0, 0, 0),
(20000005, 3, 'Madhubani painting or Mithila painting', 'Maithili Women of Nepal Foundation', '', 'Landscape', 'Madhubani painting or Mithila painting is a style of Hindu Painting, practiced in the Mithila region of Nepal and in Indian States of Bihar. Painting is done with fingers, twigs, brushes, nib-pens, and matchsticks, using natural dyes and pigments, and is characterized by eye-catching geometrical patterns.There are paintings for each occasion and festival such as birth, marriage, Holi, Surya Shasti, Kali Puja,Upanayanam, Durga Puja etc.\r\n\r\nThe Mithila region, from which the name Mithila art is derived, is believed to have been the kingdom of King Janak. The exact location of it lies in present-day Janakpur of Nepal. Madhubani paintings mostly depict nature and Hindu devotional events, and the themes generally revolve around Hindu deities like Krishna, Ram, Shiva, Durga, Lakshmi, and Saraswati. Natural objects like the sun, the moon, and the religious plants like tulsi are also widely painted, along side scenes from the royal courts and social events like weddings. Generally no empty space is left; the gaps are filled by paintings of flowers, animals, birds, and even geometric designs.', '2019-05-25', 18000, 'Natural home made ingredients such as flour, turmeric powder, red chilly powder, etc', 'Minimalist Golden Metallic Frame ', '400 by 300 cm', 'none', 'none', 'none', 6, 'mithila.jpeg', 0, 1, '20000', '3000', 5, 1, 1),
(20000006, 3, 'One of a Pair of Jain Manuscript Covers (Patli)', 'Anonymus', '12th Century', 'Figure', 'This pair of covers appears to be contemporary with twelfth-century sets in the Jaisalmer Jain temple library in Rajasthan. The figures are rendered naively, shown frontally but with faces in three-quarter profile, and the use of gesture is animated if theatrical. The pictorial conventions of silhouetted figures drawn in black outline on a flat red ground is in evidence, marking the beginnings of the western Indian style. Depicted on the interiors of the covers are scenes of assembled dignitaries, probably illustrating events from the life of a jina as described in the hagiographical literature. Alternatively, they may represent the climactic scene of the story in which the princess Damayanti selects her future husband, Nala, from an assembly of candidates in a practice known as svayamvara. A Hindu story recounted in the Mahabharata, it was popular in Svetambara Jain circles in western India beginning about A.D. 1000.', '2019-05-25', 20000, 'Ancient products found in 12th century', 'none', '5.5 by 32.4 cm', 'none', 'none', 'none', 2, 'jain.jpg', 0, 0, '0', '0', 0, 1, 1),
(20000007, 4, 'Mountain', 'Raj Bhai Suwal', '2016', 'Landscape', 'Head to Pokhara in Western Nepal to begin trekking beneath the sharp peaks and vertiginous valleys of the Annapurna Mountains. You and your fellow adventurers will set out along the ridgeline of the lower foothills, trekking to around 7,500 feet before dropping into the beautiful Modi River Valley. Get to know one another on an easy walk through the lush valley farmlands of Nepal. Soon, youâ??ll be starting your challenging full-day climb past terraced rice fields, thick forests, and picturesque hamlets on your way to Ghandruk. This mountain village offers stunning views of the surrounding peaks. Snap pictures with a friend, or join some of your fellow travelers to visit the women of the town, who weave traditional Nepalese rugs.', '2019-05-25', 16000, 'none', 'none', '200 by 300 cm', 'Colored', 'none', 'none', 7, 'mountain.jpg', 0, 0, '0', '0', 0, 0, 0),
(20000008, 4, 'The Siddha Gufa in Bandipur', 'Raj Bhai Suwal', '2016', 'Landscape', 'Nepal has many caves and hidden underground crevasses, especially in places like Pokhara and Mustang. Correspondingly, in a little village called Bandipur as well, there lies the Siddha Gufa. The cave is 437 meters deep with a 50 meter high rock ceiling. It is also said to be the largest cave in Nepal. With the ceiling of the cave covered in roosting bats, exploring the cave is quite a thrill. The grand interior of the cave eroded with minerals like the stalagmites and the stalactites gives the insides of the cave a cathedral-like impression. Moreover, Bandipur itself is a dainty little town that you can enjoy a lovely hike/short trek in. It is mostly occupied by the Newars, and thus- you can experience a beautiful Newari culture as you roam the cobbled streets of the village lined with traditional old houses.', '2019-05-25', 16000, 'none', 'none', '200 by 300 cm', 'Colored', 'none', 'none', 6, 'scene.jpg', 0, 0, '0', '0', 0, 0, 0),
(20000009, 5, 'Northern Netherlandish, Guelders, probably Nijmegen', 'ECCE HOMO', '1490-1500', 'Figure', 'The Ecce Homo relief was carved around 1490-1500 in oak, the wood most commonly used in Netherlandish and Lower Rhenish sculpture. Probably created by an artist active in the northern part of the former duchy of Guelders and Nijmegen, the sculpture was most likely originally polychromed; the wood remains in an overall excellent state of preservation. \r\nThe composition may have been inspired by contemporary prints as German engravings of the late 15th century were distributed throughout Europe almost immediately after they were printed. Prints made by Martin Schongauer in the Upper Rhine valley were especially popular aqs they were used by sculptors as a source for their own compositions. Several details from Schongauerâ??s Ecce Homo print, both composition and decorative, were adopted by the sculptor of the present relief ', '2019-06-23', 22000, 'none', 'none', '30 by 150', 'none', 'Butternut Wood', '0.50 kg', 2, 'sculp.jpg', 0, 0, '0', '0', 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `replies`
--

CREATE TABLE `replies` (
  `reply_id` int(10) NOT NULL,
  `contact_id` int(10) NOT NULL DEFAULT '0',
  `description` varchar(4000) NOT NULL DEFAULT ' ',
  `reply_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `replies`
--

INSERT INTO `replies` (`reply_id`, `contact_id`, `description`, `reply_date`) VALUES
(1, 1, 'Sure, I will do it right away.', '2019-04-26 17:02:56'),
(3, 2, 'Thank you for ur appreciation.', '2019-04-26 17:21:06'),
(4, 3, 'Your very much welcome. If you have any other problems please of inform me.', '2019-04-26 17:42:33'),
(5, 5, 'We are glad to help you', '2019-04-26 18:01:27'),
(7, 6, 'All the items of carving category has been sold out. We will soon be adding items regarding carving category', '2019-04-27 15:12:19');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(10) NOT NULL,
  `username` varchar(100) NOT NULL DEFAULT ' ',
  `contact_no` varchar(100) NOT NULL DEFAULT ' ',
  `address` varchar(100) NOT NULL DEFAULT ' ',
  `user_type_id` int(10) NOT NULL DEFAULT '0',
  `email` varchar(100) NOT NULL DEFAULT ' ',
  `password` varchar(100) NOT NULL DEFAULT ' ',
  `form_id` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `contact_no`, `address`, `user_type_id`, `email`, `password`, `form_id`) VALUES
(1, 'Mijala Shakya', '1234567890', 'Lazimpat, Kathmandu', 1, 'mijala@gmail.com', 'ÕIRB~\rÜ›À%3ËÕ¿', 0),
(2, 'Sekiya Shakya', '2345678901', 'Pulchowk, Lalitpur', 3, 'sekiya@gmail.com', '\Zç†fÁ‰XJ•ªÞ:•ÐÊ', 1),
(3, 'Sudishna Shakya', '1234567890', 'Lazimpat, Kathmandu', 2, 'sudi@gmail.com', '5µŸUrÀmÐuø0Íµ‡Þ', 2),
(4, 'Mila Bajracharya', '3456789012', 'Lagankhel, Lalitpur', 3, 'mila@gmail.com', 'ÛW|„Þ\'ÖÊga<\0²', 3),
(5, 'Manik Ratna Shakya', '5678901234', 'Lazimpat, Kathmandu', 2, 'manik@gmail.com', 'ñtñ’ûÃ®{¾þQðVçÒ’', 4),
(6, 'Sanu Kesari Bajracharya', '8901234567', 'Lazimpat, Kathmandu', 3, 'sanu@gmail.com', 'm¥ÄKpÒt©O@F÷‰O', 6),
(7, 'Anishma Tuladhar', '9012345678', 'Sitapaila', 3, 'alice@gmail.com', 'Yx>êI0jžäŠš1G', 7);

-- --------------------------------------------------------

--
-- Table structure for table `user_types`
--

CREATE TABLE `user_types` (
  `user_type_id` int(10) NOT NULL,
  `user_type` varchar(254) NOT NULL DEFAULT ' ',
  `status` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_types`
--

INSERT INTO `user_types` (`user_type_id`, `user_type`, `status`) VALUES
(1, ' Administrator', 0),
(2, ' Buyer', 1),
(3, ' Seller', 1),
(4, ' Buyer and Seller', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `auctions`
--
ALTER TABLE `auctions`
  ADD PRIMARY KEY (`auction_id`);

--
-- Indexes for table `biddings`
--
ALTER TABLE `biddings`
  ADD PRIMARY KEY (`bid_id`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`cat_id`);

--
-- Indexes for table `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`contact_id`);

--
-- Indexes for table `interest_forms`
--
ALTER TABLE `interest_forms`
  ADD PRIMARY KEY (`form_id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`item_lot`);

--
-- Indexes for table `replies`
--
ALTER TABLE `replies`
  ADD PRIMARY KEY (`reply_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_types`
--
ALTER TABLE `user_types`
  ADD PRIMARY KEY (`user_type_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `auctions`
--
ALTER TABLE `auctions`
  MODIFY `auction_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `biddings`
--
ALTER TABLE `biddings`
  MODIFY `bid_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `cat_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `contacts`
--
ALTER TABLE `contacts`
  MODIFY `contact_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `interest_forms`
--
ALTER TABLE `interest_forms`
  MODIFY `form_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `replies`
--
ALTER TABLE `replies`
  MODIFY `reply_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user_types`
--
ALTER TABLE `user_types`
  MODIFY `user_type_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
