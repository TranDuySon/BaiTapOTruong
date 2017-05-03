-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 03, 2017 at 09:54 AM
-- Server version: 5.7.17-0ubuntu0.16.04.2
-- PHP Version: 5.6.30-10+deb.sury.org~xenial+2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tien`
--

-- --------------------------------------------------------

--
-- Table structure for table `config`
--

CREATE TABLE `config` (
  `id` int(11) NOT NULL,
  `k` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `v` longtext COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `config`
--

INSERT INTO `config` (`id`, `k`, `v`) VALUES
(1, 'left-sidebar', '<h3 style="text-align: center;"><span style="color: #ff0000;">Nội dung quảng c&aacute;o !</span></h3>\r\n<p style="text-align: center;">&nbsp;</p>\r\n<p style="text-align: center;"><img src="../upload/avatar.jpg?1491997760862" alt="avatar" width="226" height="226" /></p>\r\n<p style="text-align: center;">&nbsp;</p>\r\n<p style="text-align: center;">&nbsp;</p>');
INSERT INTO `config` (`id`, `k`, `v`) VALUES
INSERT INTO `config` (`id`, `k`, `v`) VALUES
(3, 'right-sidebar', '<p><strong><em>Đ&acirc;y l&agrave; phần right sidebar</em></strong></p>\r\n<p><strong><em><img src="../../ushop/upload/ok_tree-small.jpg?1518766523252" alt="ok_tree-small" width="333" height="307" /></em></strong></p>');

-- --------------------------------------------------------

--
-- Table structure for table `dang_ky`
--

CREATE TABLE `dang_ky` (
  `id` int(11) NOT NULL,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `ten` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lienhe`
--

CREATE TABLE `lienhe` (
  `id` int(11) NOT NULL,
  `ten` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `diachi` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `content` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `lienhe`
--

INSERT INTO `lienhe` (`id`, `ten`, `diachi`, `email`, `sdt`, `content`) VALUES
(1, 'asdasda', 'asdasd', 'cuongdcdev@gmail.com', '0123456789', 'asdasd'),
(2, 'cuong', 'ở nhà', 'duongcuong96@gmail.com', '0123456789', 'adasdasdasdasd'),
(3, 'dương công cường', 'ở nhà', 'cuongdcdev@gmail.com', '0123456789', 'adasdasdasd'),
(4, '123123123', 'adasd', 'duongcuong96@gmail.com', '0123456789', 'adasd'),
(5, '123123123', 'dasd', 'duongcuong96@gmail.com', '01234', 'asdas'),
(6, 'dương công cường', 'ở nhà', 'cuongdcdev@gmail.com', '0123456789', 'adasdasdasd');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `name` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `info` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id`, `name`, `info`) VALUES
(3, 'Hoa cúc 1111', 'hoa cúc cúc cù cu cu.......~~~\r\nhoa cúc cúc cù cu cu.......~~~\r\n\r\nhoa cúc cúc cù cu cu.......~~~'),
(5, 'Hoa ahihi', 'ahihi..\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `sp`
--

CREATE TABLE `sp` (
  `id` int(10) UNSIGNED NOT NULL,
  `menu` int(10) UNSIGNED NOT NULL DEFAULT '1',
  `avatar` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `info` text COLLATE utf8_unicode_ci NOT NULL,
  `excerpt` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `price` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sp`
--

INSERT INTO `sp` (`id`, `menu`, `avatar`, `name`, `info`, `excerpt`, `price`) VALUES
(4, 5, 'Temple.jpg', 'Hoa Mì Chính', '<h2 class="knc-sapo">Nhờ sự chuy&ecirc;n nghiệp v&agrave; nhanh nhạy của m&igrave;nh, FPT Shop đ&atilde; gi&agrave;nh thắng lợi trước đối thủ mặc d&ugrave; c&oacute; quy m&ocirc; nhỏ hơn.</h2>\r\n<div class="clearfix">&nbsp;</div>\r\n<div id="ContentDetail" class="knc-content">\r\n<p>Ngay sau khi Samsung ra mắt Galaxy S8 v&agrave; S8+ v&agrave;o ng&agrave;y 29/03 vừa qua, c&aacute;c nh&agrave; b&aacute;n lẻ tại Việt Nam đ&atilde; lập tức khởi động chương tr&igrave;nh đặt h&agrave;ng bộ đ&ocirc;i flagship n&agrave;y tại Việt Nam, trong đ&oacute; c&oacute; Thế Giới Di Động v&agrave; FPT Shop. T&iacute;nh đến nay đ&atilde; gần hai tuần kể từ khi chương tr&igrave;nh đặt h&agrave;ng bắt đầu, liệu hai &ocirc;ng lớn n&agrave;y đ&atilde; đạt được kết quả ra sao?</p>\r\n<p>Theo số liệu mới nhất được ch&uacute;ng t&ocirc;i ghi nhận v&agrave;o l&uacute;c 16h30 ng&agrave;y 10/04, FPT Shop đang c&oacute; lượng đặt h&agrave;ng &aacute;p đảo, cụ thể l&agrave; 6030 đơn so với 3302 đơn của Thế Giới Di Động. Khi chỉ t&iacute;nh những kh&aacute;ch h&agrave;ng đ&atilde; đặt cọc, FPT Shop vẫn vượt mặt Thế Giới Di Động mặc d&ugrave; khoảng c&aacute;ch được thu hẹp chỉ c&ograve;n 2918 v&agrave; 2189 kh&aacute;ch. Qua số liệu tr&ecirc;n, FPT Shop trở th&agrave;nh nh&agrave; b&aacute;n lẻ dẫn đầu tại Việt Nam về lượng kh&aacute;ch đặt h&agrave;ng v&agrave; đặt cọc Galaxy S8.</p>\r\n<div class="VCSortableInPreviewMode" style="width: 640px;">\r\n<div><img id="img_4eda5db0-1dd6-11e7-a6b8-71d644951437" style="max-width: 100%; cursor: none;" src="http://genknews.genkcdn.vn/thumb_w/640/2017/screen-shot-2017-04-10-at-4-40-05-pm-1491819192851.jpg" alt="\r\nSố liệu của Thế Giới Di Động (tr&aacute;i) v&agrave; FPT Shop (phải)\r\n" data-original="http://genknews.genkcdn.vn/2017/screen-shot-2017-04-10-at-4-40-05-pm-1491819192851.jpg" /></div>\r\n<div class="PhotoCMS_Caption">\r\n<p style="text-align: center; margin: 0px;">Số liệu của Thế Giới Di Động (tr&aacute;i) v&agrave; FPT Shop (phải)</p>\r\n</div>\r\n</div>\r\n<div class="VCSortableInPreviewMode IMSCurrentEditorEditObject" style="width: 640px;">\r\n<div><img id="img_c243f260-1dd2-11e7-9980-f9d2300813a8" style="max-width: 100%; cursor: none;" src="http://genknews.genkcdn.vn/thumb_w/640/2017/screen-shot-2017-04-10-at-4-46-47-pm-1491817668321.jpg" alt="\r\nFPT Shop vượt mặt Thế Giới Di Động về lượng đơn đặt h&agrave;ng v&agrave; đặt cọc\r\n" data-original="http://genknews.genkcdn.vn/2017/screen-shot-2017-04-10-at-4-46-47-pm-1491817668321.jpg" /></div>\r\n<div class="PhotoCMS_Caption">\r\n<p style="text-align: center; margin: 0px;">FPT Shop vượt mặt Thế Giới Di Động về lượng đơn đặt h&agrave;ng v&agrave; đặt cọc</p>\r\n</div>\r\n</div>\r\n<p>Điều đ&aacute;ng n&oacute;i l&agrave; hiện FPT Shop đang l&agrave; nh&agrave; b&aacute;n lẻ thứ hai tại Việt Nam, chiếm 15% thị phần v&agrave; vẫn c&ograve;n thua k&eacute;m kh&aacute; nhiều so với người dẫn đầu l&agrave; Thế Giới Di Động với 40% thị phần. Quy m&ocirc; về hệ thống cửa h&agrave;ng của FPT Shop cũng chỉ bằng 1/3, với 415 cửa h&agrave;ng so với 1330 cửa h&agrave;ng của Thế Giới Di Động. Vậy n&ecirc;n, th&agrave;nh t&iacute;ch &aacute;p đảo của FPT Shop đạt được so với Thế Giới Di Động quả thật l&agrave; điều "kh&ocirc;ng thể tin nổi".</p>\r\n<p>Một trong những l&yacute; do dẫn đến th&agrave;nh c&ocirc;ng của FPT Shop được cho l&agrave; đến từ việc hệ thống n&agrave;y đ&atilde; c&oacute; một sự chuẩn bị kh&ocirc;ng những nhanh nhạy, m&agrave; c&ograve;n chu đ&aacute;o hơn so với Thế Giới Di Động. Ngay sau khi Samsung c&ocirc;ng bố m&aacute;y v&agrave;o đ&ecirc;m 29/3, FPT Shop đ&atilde; tung ra chương tr&igrave;nh đặt h&agrave;ng của m&igrave;nh với h&igrave;nh ảnh v&agrave; th&ocirc;ng tin chuẩn x&aacute;c về m&aacute;y. Th&ocirc;ng tin m&agrave; người d&ugrave;ng quan t&acirc;m nhất l&agrave; gi&aacute; b&aacute;n dự kiến cũng được c&ocirc;ng bố.</p>\r\n</div>', '<p>T&oacute;m tắt bla bla</p>', '12'),
(5, 4, '168.jpg', 'Hoa Sò', 'Loài hoa này có thể nấu canh được', 'Loài hoa này có thể nấu canh được', '1 đô la'),
(6, 3, 'Mr. Lee.jpg', 'Hoa đèn lồng', '<p>Hoa đ&egrave;n lồng</p>\r\n<p>&nbsp;</p>\r\n<div class="kbwc-header clearfix">\r\n<h1 class="kbwc-title clearfix">Mảng phần cứng Surface sụt giảm 285 triệu USD, thế nhưng đ&oacute; lại l&agrave; một tin tốt đối với Microsoft</h1>\r\n<div class="kbwc-meta"><span class="kbwcm-author">TVD</span> , <span class="kbwcm-source">Theo <a href="http://ttvn.vn" target="_blank" rel="nofollow noopener noreferrer">Tr&iacute; Thức Trẻ</a></span> <span class="kbwcm-time" title="2017-04-28T14:27:00">4 giờ trước</span></div>\r\n<div class="kbwc-socials"><span class="kbwcs-comment">B&igrave;nh luận <span class="kbwcs-number fr item-comment countdetaicomment">0</span></span> <a class="kbwcs-fb facebook_share_button" rel="nofollow">Chia sẻ <span class="kbwcs-number fr">2</span></a>\r\n<div class="fb-like fb_iframe_widget" data-href="http://genk.vn/news-20170428142723147.chn" data-layout="button_count" data-action="like" data-size="small" data-show-faces="false" data-share="false"><span style="vertical-align: top; width: 0px; height: 0px; overflow: hidden;"><iframe style="visibility: hidden;" title="fb:like Facebook Social Plugin" src="https://www.facebook.com/plugins/like.php?action=like&amp;app_id=180276625471433&amp;channel=http%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2F87XNE1PC38r.js%3Fversion%3D42%23cb%3Df258dfccebd5a14%26domain%3Dgenk.vn%26origin%3Dhttp%253A%252F%252Fgenk.vn%252Ff1fc92ec65ffe74%26relation%3Dparent.parent&amp;container_width=0&amp;href=http%3A%2F%2Fgenk.vn%2Fnews-20170428142723147.chn&amp;layout=button_count&amp;locale=vi_VN&amp;sdk=joey&amp;share=false&amp;show_faces=false&amp;size=small" name="f390af27805a444" width="1000px" height="1000px" frameborder="0" scrolling="no" allowfullscreen="allowfullscreen" data-mce-fragment="1"></iframe></span></div>\r\n<div class="fr mr-50">\r\n<div class="fb-send fl mgr5 fb_iframe_widget" data-href="http://genk.vn/news-20170428142723147.chn" data-colorscheme="dark"><span style="vertical-align: top; width: 0px; height: 0px; overflow: hidden;"><iframe style="visibility: hidden;" title="fb:send Facebook Social Plugin" src="https://www.facebook.com/plugins/send.php?app_id=180276625471433&amp;channel=http%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2F87XNE1PC38r.js%3Fversion%3D42%23cb%3Df3a82503b6c6058%26domain%3Dgenk.vn%26origin%3Dhttp%253A%252F%252Fgenk.vn%252Ff1fc92ec65ffe74%26relation%3Dparent.parent&amp;color_scheme=dark&amp;container_width=0&amp;href=http%3A%2F%2Fgenk.vn%2Fnews-20170428142723147.chn&amp;locale=vi_VN&amp;sdk=joey" name="fd652ea3e2da16" width="1000px" height="1000px" frameborder="0" scrolling="no" allowfullscreen="allowfullscreen" data-mce-fragment="1"></iframe></span></div>\r\n<div class="ico-mailto">&nbsp;</div>\r\n</div>\r\n</div>\r\n</div>\r\n<div class="kbwcb-left-wrapper content">\r\n<div class="klw-new-content">\r\n<div id="ContentPlaceHolder1_ContentPlaceHolder1_ctrNewsDetail_lstRelation" class="knc-relate-wrapper">\r\n<ul class="krw-list">\r\n<li class="krwli"><a title="Microsoft bi&ecirc;́t v&ecirc;̀ l&ocirc;̃ h&ocirc;̉ng bảo m&acirc;̣t đe dọa hàng tri&ecirc;̣u máy tính tr&ecirc;n Word nhưng 6 tháng sau mới chịu vá, tại sao vậy?" href="http://genk.vn/microsoft-biet-ve-lo-hong-bao-mat-de-doa-hang-trieu-may-tinh-tren-word-nhung-6-thang-sau-moi-chiu-va-tai-sao-vay-20170427123217334.chn">Microsoft bi&ecirc;́t v&ecirc;̀ l&ocirc;̃ h&ocirc;̉ng bảo m&acirc;̣t đe dọa hàng tri&ecirc;̣u máy tính tr&ecirc;n Word nhưng 6 tháng sau mới chịu vá, tại sao vậy?</a></li>\r\n<li class="krwli"><a title="Microsoft khuy&ecirc;n người d&ugrave;ng kh&ocirc;ng vội c&agrave;i bản cập nhật Windows 10" href="http://genk.vn/microsoft-khuyen-nguoi-dung-khong-voi-cai-ban-cap-nhat-windows-10-20170427141443381.chn">Microsoft khuy&ecirc;n người d&ugrave;ng kh&ocirc;ng vội c&agrave;i bản cập nhật Windows 10</a></li>\r\n</ul>\r\n</div>\r\n<h2 class="knc-sapo">Microsoft cần phải ăn mừng khi ng&agrave;y c&agrave;ng c&oacute; nhiều nh&agrave; sản xuất phần cứng muốn cạnh tranh với Surface Pro v&agrave; Surface Book.</h2>\r\n<div class="clearfix">&nbsp;</div>\r\n<div id="ContentDetail" class="knc-content">\r\n<p>Microsoft vừa c&ocirc;ng bố b&aacute;o c&aacute;o t&agrave;i ch&iacute;nh Q1/2017, với những con số tăng trưởng bền vững. Điện to&aacute;n đ&aacute;m m&acirc;y Azure v&agrave; Office 365 l&agrave; những mảng kinh doanh tăng trưởng mạnh mẽ nhất của Microsoft, chứng minh hướng đi tập trung v&agrave;o doanh nghiệp v&agrave; đ&aacute;m m&acirc;y của g&atilde; khổng lồ phần mềm l&agrave; đ&uacute;ng đắn.</p>\r\n<p>Tuy nhi&ecirc;n b&ecirc;n cạnh đ&oacute;, mảng smartphone sụt giảm c&ograve;n 700 triệu USD v&agrave; được xếp v&agrave;o mảng kinh doanh kh&ocirc;ng c&oacute; tầm quan trọng đối với Microsoft. Thế nhưng đ&oacute; vẫn chưa phải điều tồi tệ nhất, bởi ai cũng đo&aacute;n được mảng kinh doanh smartphone của Microsoft đ&atilde; chạm đ&aacute;y.</p>\r\n<div class="VCSortableInPreviewMode IMSCurrentEditorEditObject" style="width: 630px;">\r\n<div><img id="img_ace615a0-2be3-11e7-94dd-f5fb809058d1" src="http://genknews.genkcdn.vn/thumb_w/640/2017/photo-0-1493364249280.png" alt="\r\nMảng phần cứng Surface sụt giảm nhưng Microsoft kh&ocirc;ng hề vội v&atilde; ra mắt thiết bị mới.\r\n" data-original="http://genknews.genkcdn.vn/2017/photo-0-1493364249280.png" /></div>\r\n<div class="PhotoCMS_Caption" style="width: 610px; margin: auto;">\r\n<p style="text-align: center; margin: 0px;">Mảng phần cứng Surface sụt giảm nhưng Microsoft kh&ocirc;ng hề vội v&atilde; ra mắt thiết bị mới.</p>\r\n</div>\r\n</div>\r\n<p>Con số khiến nhiều người bất ngờ ch&iacute;nh l&agrave; việc doanh thu từ phần cứng Surface sụt giảm mạnh 26%, tương đương 285 triệu USD so với c&ugrave;ng kỳ năm 2016. Mặc d&ugrave; hai thiết bị Surface Pro 4 v&agrave; Surface Book của Microsoft được đ&aacute;nh gi&aacute; rất cao khi ra mắt.</p>\r\n<p><strong>G&atilde; khổng lồ phần mềm cho biết l&yacute; do của sự sụt giảm n&agrave;y l&agrave; việc c&aacute;c đối thủ kh&aacute;c g&acirc;y sức &eacute;p v&agrave; cạnh tranh khốc liệt với nhiều sản phẩm tablet 2-in-1, với gi&aacute; b&aacute;n hấp dẫn hơn.</strong> B&ecirc;n cạnh đ&oacute; th&igrave; cả Surface Pro 4 v&agrave; Surface Book đều đ&atilde; ra mắt từ rất l&acirc;u, khi ở cuối v&ograve;ng đời của một sản phẩm ch&uacute;ng sẽ mất đi sự hấp dẫn đối với người ti&ecirc;u d&ugrave;ng.</p>\r\n<p>Trong khi đ&oacute; Microsoft vẫn chưa ra mắt những thiết bị Surface mới, khiến cho mảng kinh doanh n&agrave;y kh&ocirc;ng thể vực dậy. Tuy nhi&ecirc;n tr&ecirc;n thực tế th&igrave; đ&acirc;y lại l&agrave; một tin tốt đối với Microsoft. Nghe c&oacute; vẻ kh&ocirc;ng logic, nhưng n&oacute; lại l&agrave; như vậy.</p>\r\n<div class="VCSortableInPreviewMode" style="width: 630px;">\r\n<div><img id="img_bd0436b0-2be3-11e7-b630-eb19d879ac9b" src="http://genknews.genkcdn.vn/thumb_w/640/2017/photo-0-1493364276852.jpg" alt="\r\nT&iacute;nh cả rồi.\r\n" data-original="http://genknews.genkcdn.vn/2017/photo-0-1493364276852.jpg" /></div>\r\n<div class="PhotoCMS_Caption" style="width: 610px; margin: auto;">\r\n<p style="text-align: center; margin: 0px;">T&iacute;nh cả rồi.</p>\r\n</div>\r\n</div>\r\n<p>Bởi Microsoft kh&ocirc;ng phải l&agrave; một c&ocirc;ng ty phần cứng v&agrave; sống phụ thuộc ho&agrave;n to&agrave;n v&agrave;o một d&ograve;ng sản phẩm, như Apple. Microsoft thiết kế v&agrave; sản xuất c&aacute;c tablet Surface Pro, Surface Book nhằm mục đ&iacute;ch tạo ra những thiết bị Windows tốt hơn, dễ sử dụng hơn, mang lại nhiều hiệu quả hơn.</p>\r\n<p>Thực tế Surface Pro v&agrave; Surface Book của Microsoft đ&atilde; l&agrave;m thay đổi quan niệm về tablet v&agrave; laptop, tạo ra một kh&aacute;i niệm mới về những thiết bị tablet lai laptop sử dụng Windows 10. N&oacute; đ&atilde; trở th&agrave;nh một xu hướng mới của ng&agrave;nh c&ocirc;ng nghiệp m&aacute;y t&iacute;nh v&agrave; ng&agrave;y c&agrave;ng c&oacute; nhiều nh&agrave; sản xuất, cũng như người ti&ecirc;u d&ugrave;ng chạy theo xu hướng đ&oacute;.</p>\r\n<p>Bằng chứng dễ thấy l&agrave; việc cạnh tranh về gi&aacute; cả, n&oacute; c&oacute; nghĩa l&agrave; rất nhiều thiết bị tablet 2-in-1 đ&atilde; được ra mắt với hiệu năng tốt, khiến cho c&aacute;c nh&agrave; sản xuất phải cạnh tranh với nhau bằng gi&aacute;. Tất nhi&ecirc;n người ti&ecirc;u d&ugrave;ng sẽ được hưởng lợi khi họ c&oacute; nhiều lựa chọn với nhiều mức gi&aacute; hợp l&yacute;.</p>\r\n<p>B&ecirc;n cạnh đ&oacute;, c&oacute; một kẻ kh&aacute;c được hưởng lợi từ việc n&agrave;y v&agrave; đ&oacute; ch&iacute;nh l&agrave; mảng kinh doanh hệ điều h&agrave;nh Windows của Microsoft. Để c&oacute; thể b&aacute;n ra những chiếc tablet 2-in-1, c&aacute;c nh&agrave; sản xuất buộc phải mua bản quyền hệ điều h&agrave;nh Windows 10 của Microsoft.</p>\r\n<p>Kể từ khi thị trường m&aacute;y t&iacute;nh để b&agrave;n đ&oacute;ng băng, miếng b&aacute;nh n&agrave;y ng&agrave;y c&agrave;ng bị thu hẹp khi Microsoft c&ograve;n phải cạnh tranh với Mac của Apple. Tuy nhi&ecirc;n một hướng đi mới đ&atilde; được tạo ra, đ&oacute; kh&ocirc;ng phải l&agrave; m&aacute;y t&iacute;nh để b&agrave;n hay laptop, đ&oacute; l&agrave; những thiết bị tablet 2-in-1.</p>\r\n<p>Với việc ng&agrave;y c&agrave;ng c&oacute; nhiều người sử dụng hệ điều h&agrave;nh Windows 10, tr&ecirc;n nền tảng tablet hay laptop, Microsoft lại c&oacute; th&ecirc;m cơ hội để tạo ra doanh thu từ c&aacute;c dịch vụ của m&igrave;nh. Đ&oacute; l&agrave; c&aacute;c phần mềm, điện to&aacute;n đ&aacute;m m&acirc;y v&agrave; t&igrave;m kiếm được t&iacute;ch hợp trong Windows 10.</p>\r\n<p>Ch&iacute;nh v&igrave; vậy m&agrave; việc mảng kinh doanh phần cứng Surface sụt giảm mạnh cũng kh&ocirc;ng khiến Microsoft qu&aacute; lo lắng. Bằng chứng l&agrave; g&atilde; khổng lồ phần mềm vẫn chưa vội v&atilde; ra mắt Surface Pro 5 hay Surface Book 2. Chắc chắn hai thiết bị n&agrave;y sẽ được ra mắt, nhưng c&oacute; lẽ ch&uacute;ng ta sẽ phải đợi rất l&acirc;u nữa, c&oacute; thể l&agrave; cuối năm nay.</p>\r\n</div>\r\n</div>\r\n</div>', '<p>Hoa đ&egrave;n lồngHoa đ&egrave;n lồng Hoa đ&egrave;n lồngHoa đ&egrave;n lồng Hoa đ&egrave;n lồngHoa đ&egrave;n lồng</p>', '123'),
(7, 5, 'Paris la Tour Eiffel.jpg', 'Hoa tháp Effei', 'Đây là bông hoa mọc giống cái tháp ', 'Đây là bông hoa mọc giống cái tháp ', '2345'),
(8, 3, 'Our Night Under The Stars.jpg', 'kill the dj', 'asdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasodasdhasjdaskdasoddjsfkldsfjl', 'asdhasjdaskdasod', '123'),
(9, 3, 'Numix_Name_of_the_Doctor_16_9.png', 'ten hoa', 'Thông tin giới thiệThông tin giới thiệ', 'tom tat', '55'),
(10, 3, 'avatar.png', 'hoa cánh cụt', '<p><img src="../upload/avatar.jpg?1491996016814" alt="avatar" /></p>\r\n<p>&nbsp;</p>\r\n<p>hoa</p>', '<p><img src="../upload/avatar.jpg?1491996021712" alt="avatar" /></p>\r\n<p>&nbsp;</p>\r\n<p>inu</p>', '12');

-- --------------------------------------------------------

--
-- Table structure for table `thanhtoan`
--

CREATE TABLE `thanhtoan` (
  `id` int(11) NOT NULL,
  `ten` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `diachi` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '0 : đang chờ giao | 1 : ok | -1 : hủy'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `thanhtoan`
--

INSERT INTO `thanhtoan` (`id`, `ten`, `diachi`, `sdt`, `email`, `status`) VALUES
(1, 'cuong', 'cuong', '1234566', 'cuong@gmail.com', 0),
(2, 'cuong', 'cuong', '1234566', 'cuong@gmail.com', 0),
(3, 'cuong', 'cuong', '1234566', 'cuong@gmail.com', 0),
(4, 'cuong', 'cuong', '1234566', 'cuong@gmail.com', 0),
(5, 'cường', 'cuong', '1234566', 'cuong@gmail.com', 0);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `info` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `info`) VALUES
(1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'Bờ la bờ lô bờ la là ra bờ ao\r\n'),
(2, 'cuong', 'cf4d87e50be6390ee9bd8ad6e7498cae', 'day la cuong\r\n');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `config`
--
ALTER TABLE `config`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `k` (`k`);

--
-- Indexes for table `dang_ky`
--
ALTER TABLE `dang_ky`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lienhe`
--
ALTER TABLE `lienhe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sp`
--
ALTER TABLE `sp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `thanhtoan`
--
ALTER TABLE `thanhtoan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `config`
--
ALTER TABLE `config`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `dang_ky`
--
ALTER TABLE `dang_ky`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `lienhe`
--
ALTER TABLE `lienhe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `sp`
--
ALTER TABLE `sp`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `thanhtoan`
--
ALTER TABLE `thanhtoan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;