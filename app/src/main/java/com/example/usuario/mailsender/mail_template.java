package com.example.usuario.mailsender;

/**
 * Created by Usuario on 20/10/2017.
 */

public class mail_template {

    String envio;
    String usuarioemisor;
    String usuarioreceptor;
    String nombrerestaurante;
    String codigoreserva;

    public mail_template(String usuarioemisor, String usuarioreceptor, String nombrerestaurante, String codigoreserva) {
        this.usuarioemisor = usuarioemisor;
        this.usuarioreceptor = usuarioreceptor;
        this.nombrerestaurante = nombrerestaurante;
        this.codigoreserva = codigoreserva;
    }

    public String setEnvio() {
        this.envio = "" +
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "\t<head>\n" +
                "\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
                "\t\t<title>Portfolio - Responsive Email Template</title>\n" +
                "\t\t<style type=\"text/css\">\n" +
                "\t\t\t/* ----- Custom Font Import ----- */\n" +
                "\t\t\t@import url(https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic&subset=latin,latin-ext);\n" +
                "\n" +
                "\t\t\t/* ----- Text Styles ----- */\n" +
                "\t\t\ttable{\n" +
                "\t\t\t\tfont-family: 'Lato', Arial, sans-serif;\n" +
                "\t\t\t\t-webkit-font-smoothing: antialiased;\n" +
                "\t\t\t\t-moz-font-smoothing: antialiased;\n" +
                "\t\t\t\tfont-smoothing: antialiased;\n" +
                "\t\t\t}\n" +
                "\n" +
                "\t\t\t@media only screen and (max-width: 700px){\n" +
                "\t\t\t\t/* ----- Base styles ----- */\n" +
                "\t\t\t\t.full-width-container{\n" +
                "\t\t\t\t\tpadding: 0 !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.container{\n" +
                "\t\t\t\t\twidth: 100% !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- Header ----- */\n" +
                "\t\t\t\t.header td{\n" +
                "\t\t\t\t\tpadding: 30px 15px 30px 15px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- Projects list ----- */\n" +
                "\t\t\t\t.projects-list{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.projects-list tr{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.projects-list td{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.projects-list tbody{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.projects-list img{\n" +
                "\t\t\t\t\tmargin: 0 auto 25px auto;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- Half block ----- */\n" +
                "\t\t\t\t.half-block{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.half-block tr{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.half-block td{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.half-block__image{\n" +
                "\t\t\t\t\twidth: 100% !important;\n" +
                "\t\t\t\t\tbackground-size: cover;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.half-block__content{\n" +
                "\t\t\t\t\twidth: 100% !important;\n" +
                "\t\t\t\t\tbox-sizing: border-box;\n" +
                "\t\t\t\t\tpadding: 25px 15px 25px 15px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- Hero subheader ----- */\n" +
                "\t\t\t\t.hero-subheader__title{\n" +
                "\t\t\t\t\tpadding: 80px 15px 15px 15px !important;\n" +
                "\t\t\t\t\tfont-size: 35px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.hero-subheader__content{\n" +
                "\t\t\t\t\tpadding: 0 15px 90px 15px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- Title block ----- */\n" +
                "\t\t\t\t.title-block{\n" +
                "\t\t\t\t\tpadding: 0 15px 0 15px;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- Paragraph block ----- */\n" +
                "\t\t\t\t.paragraph-block__content{\n" +
                "\t\t\t\t\tpadding: 25px 15px 18px 15px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- Info bullets ----- */\n" +
                "\t\t\t\t.info-bullets{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.info-bullets tr{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.info-bullets td{\n" +
                "\t\t\t\t\tdisplay: block !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.info-bullets tbody{\n" +
                "\t\t\t\t\tdisplay: block;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.info-bullets__icon{\n" +
                "\t\t\t\t\ttext-align: center;\n" +
                "\t\t\t\t\tpadding: 0 0 15px 0 !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.info-bullets__content{\n" +
                "\t\t\t\t\ttext-align: center;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.info-bullets__block{\n" +
                "\t\t\t\t\tpadding: 25px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t/* ----- CTA block ----- */\n" +
                "\t\t\t\t.cta-block__title{\n" +
                "\t\t\t\t\tpadding: 35px 15px 0 15px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.cta-block__content{\n" +
                "\t\t\t\t\tpadding: 20px 15px 27px 15px !important;\n" +
                "\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t.cta-block__button{\n" +
                "\t\t\t\t\tpadding: 0 15px 0 15px !important;\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t</style>\n" +
                "\n" +
                "\t\t<!--[if gte mso 9]><xml>\n" +
                "\t\t\t<o:OfficeDocumentSettings>\n" +
                "\t\t\t\t<o:AllowPNG/>\n" +
                "\t\t\t\t<o:PixelsPerInch>96</o:PixelsPerInch>\n" +
                "\t\t\t</o:OfficeDocumentSettings>\n" +
                "\t\t</xml><![endif]-->\n" +
                "\t</head>\n" +
                "\n" +
                "\t<body style=\"padding: 0; margin: 0;\" bgcolor=\"#eeeeee\">\n" +
                "\t\t<span style=\"color:transparent !important; overflow:hidden !important; display:none !important; line-height:0px !important; height:0 !important; opacity:0 !important; visibility:hidden !important; width:0 !important; mso-hide:all;\">This is your preheader text for this email (Read more about email preheaders here - https://goo.gl/e60hyK)</span>\n" +
                "\n" +
                "\t\t<!-- / Full width container -->\n" +
                "\t\t<table class=\"full-width-container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" bgcolor=\"#eeeeee\" style=\"width: 100%; height: 100%; padding: 30px 0 30px 0;\">\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t<!-- / 700px container -->\n" +
                "\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\" bgcolor=\"#ffffff\" style=\"width: 700px;\">\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t<!-- / Header -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container header\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" style=\"width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td style=\"padding: 30px 0 30px 0; border-bottom: solid 1px #eeeeee;\" align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" style=\"font-size: 30px; text-decoration: none; color: #000000;\">ITing</a>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Header -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Hero subheader -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container hero-subheader\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" style=\"width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td class=\"hero-subheader__title\" style=\"font-size: 43px; font-weight: bold; padding: 80px 0 15px 0;\" align=\"left\">Código de reserva!</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td class=\"hero-subheader__content\" style=\"font-size: 16px; line-height: 27px; color: #969696; padding: 0 60px 90px 0;\" align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\tBIENVENIDO: <strong> "+usuarioreceptor+"</strong>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</br>\n" +
                "\t\t\t\t\t\t\t\t\t\t\tHa sido usted invitado a COMER, REIR Y DISFRUTAR en el Restaurante: <strong>"+nombrerestaurante+"</strong>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</br>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</br>\n" +
                "\t\t\t\t\t\t\t\t\t\t\tA traves de este mail le indicamos cual es su codigo de reserva, de forma que unicamente tendra que APUNTAR, RECORDAR Y REDACTAR!\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</br>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</br>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<strong>CODIGO DE RESERVA: </strong> "+codigoreserva+"\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Hero subheader -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Title -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container title-block\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" style=\"width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"border-bottom: solid 1px #eeeeee; padding: 35px 0 18px 0; font-size: 26px;\" align=\"left\">Recent Works</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Title -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Projects list -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container projects-list\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"padding-top: 25px;\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/img1.jpg\" width=\"235\" height=\"235\" border=\"0\" style=\"display: block;\"></a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/img2.jpg\" width=\"235\" height=\"235\" border=\"0\" style=\"display: block;\"></a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/img3.jpg\" width=\"235\" height=\"235\" border=\"0\" style=\"display: block;\"></a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/img4.jpg\" width=\"235\" height=\"235\" border=\"0\" style=\"display: block;\"></a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/img5.jpg\" width=\"235\" height=\"235\" border=\"0\" style=\"display: block;\"></a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"img/img6.jpg\" width=\"235\" height=\"235\" border=\"0\" style=\"display: block;\"></a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Projects list -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Title -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container title-block\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" style=\"width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"border-bottom: solid 1px #eeeeee; padding: 35px 0 18px 0; font-size: 26px;\" align=\"left\">¿Quienes somos?</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Title -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Paragraph -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container paragraph-block\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" style=\"width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"paragraph-block__content\" style=\"padding: 25px 0 18px 0; font-size: 16px; line-height: 27px; color: #969696;\" align=\"left\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Paragraph -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Divider -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"padding-top: 25px;\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" align=\"center\" style=\"border-bottom: solid 1px #eeeeee; width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">&nbsp;</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Divider -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / CTA Block -->\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t<!-- /// CTA Block -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Divider -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"padding-top: 25px;\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" align=\"center\" style=\"border-bottom: solid 1px #eeeeee; width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">&nbsp;</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Divider -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Info Bullets -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container info-bullets\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" align=\"center\" style=\"width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__block\" style=\"padding: 30px 30px 15px 30px;\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__icon\" style=\"padding: 0 15px 0 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img13.png\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__content\" style=\"color: #969696; font-size: 16px;\">noreplay.iting@gmail.com</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__block\" style=\"padding: 30px 30px 15px 30px;\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__icon\" style=\"padding: 0 15px 0 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img11.png\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__content\" style=\"color: #969696; font-size: 16px;\">665 71 31 65</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__block\" style=\"padding: 30px;\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__icon\" style=\"padding: 0 15px 0 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img12.png\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__content\" style=\"color: #969696; font-size: 16px;\">Urnieta, Dendaldegi 49</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__block\" style=\"padding: 30px;\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__icon\" style=\"padding: 0 15px 0 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img12.png\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"info-bullets__content\" style=\"color: #969696; font-size: 16px;\">Dublin, Dendaldegi 49</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Info Bullets -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Social nav -->\n" +
                "\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<table class=\"container\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"620\" align=\"center\" style=\"border-top: 1px solid #eeeeee; width: 620px;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" style=\"padding: 30px 0 30px 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.facebook.com/\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img7.png\" border=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" style=\"padding: 30px 0 30px 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://plus.google.com/about?hl=es-419\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img8.png\" border=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" style=\"padding: 30px 0 30px 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://www.linkedin.com/feed/\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img9.png\" border=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" style=\"padding: 30px 0 30px 0;\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"https://twitter.com/download?logged_out=1&lang=es\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"img/img10.png\" border=\"0\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Social nav -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- / Footer -->\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<!-- /// Footer -->\n" +
                "\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t</table>\n" +
                "\t\t\t\t</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t</table>\n" +
                "\t</body>\n" +
                "</html>" +
                "";
        return envio;
    }


}
