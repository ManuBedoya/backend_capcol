package org.capcol.util;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TemplateHTML {
    public String getEmailHtmlBuy(String name) {
        return """
                  <html
                  lang="en"
                  xmlns:o="urn:schemas-microsoft-com:office:office"
                  xmlns:v="urn:schemas-microsoft-com:vml"
                >
                  <head>
                    <title></title>
                    <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
                    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

                    <link
                      href="https://fonts.googleapis.com/css?family=Cabin"
                      rel="stylesheet"
                      type="text/css"
                    />
                    <!--<![endif]-->
                    <style>
                      * {
                        box-sizing: border-box;
                      }

                      body {
                        margin: 0;
                        padding: 0;
                      }

                      a[x-apple-data-detectors] {
                        color: inherit !important;
                        text-decoration: inherit !important;
                      }

                      #MessageViewBody a {
                        color: inherit;
                        text-decoration: none;
                      }

                      p {
                        line-height: inherit;
                      }

                      .desktop_hide,
                      .desktop_hide table {
                        mso-hide: all;
                        display: none;
                        max-height: 0px;
                        overflow: hidden;
                      }

                      .image_block img + div {
                        display: none;
                      }

                      @media (max-width: 700px) {
                        .desktop_hide table.icons-inner,
                        .social_block.desktop_hide .social-table {
                          display: inline-block !important;
                        }

                        .icons-inner {
                          text-align: center;
                        }

                        .icons-inner td {
                          margin: 0 auto;
                        }

                        .image_block img.fullWidth {
                          max-width: 100% !important;
                        }

                        .mobile_hide {
                          display: none;
                        }

                        .row-content {
                          width: 100% !important;
                        }

                        .stack .column {
                          width: 100%;
                          display: block;
                        }

                        .mobile_hide {
                          min-height: 0;
                          max-height: 0;
                          max-width: 0;
                          overflow: hidden;
                          font-size: 0px;
                        }

                        .desktop_hide,
                        .desktop_hide table {
                          display: table !important;
                          max-height: none !important;
                        }

                        .reverse {
                          display: table;
                          width: 100%;
                        }

                        .reverse .column.first {
                          display: table-footer-group !important;
                        }

                        .reverse .column.last {
                          display: table-header-group !important;
                        }

                        .row-4 td.column.first .border {
                          padding: 35px 0 35px 25px;
                          border-top: 0;
                          border-right: 0px;
                          border-bottom: 0;
                          border-left: 0;
                        }

                        .row-4 td.column.last .border {
                          padding: 0 0 5px;
                          border-top: 0;
                          border-right: 0px;
                          border-bottom: 0;
                          border-left: 0;
                        }
                      }
                    </style>
                  </head>
                  <body
                    style="
                      background-color: #f2f2f2;
                      margin: 0;
                      padding: 0;
                      -webkit-text-size-adjust: none;
                      text-size-adjust: none;
                    "
                  >
                    <table
                      border="0"
                      cellpadding="0"
                      cellspacing="0"
                      class="nl-container"
                      role="presentation"
                      style="
                        mso-table-lspace: 0pt;
                        mso-table-rspace: 0pt;
                        background-color: #f2f2f2;
                      "
                      width="100%"
                    >
                      <tbody>
                        <tr>
                          <td>
                            <table
                              align="center"
                              border="0"
                              cellpadding="0"
                              cellspacing="0"
                              class="row row-1"
                              role="presentation"
                              style="mso-table-lspace: 0pt; mso-table-rspace: 0pt"
                              width="100%"
                            >
                              <tbody>
                                <tr>
                                  <td>
                                    <table
                                      align="center"
                                      border="0"
                                      cellpadding="0"
                                      cellspacing="0"
                                      class="row-content stack"
                                      role="presentation"
                                      style="
                                        mso-table-lspace: 0pt;
                                        mso-table-rspace: 0pt;
                                        color: #000;
                                        width: 680px;
                                        margin: 0 auto;
                                      "
                                      width="680"
                                    >
                                      <tbody>
                                        <tr>
                                          <td
                                            class="column column-1"
                                            style="
                                              mso-table-lspace: 0pt;
                                              mso-table-rspace: 0pt;
                                              font-weight: 400;
                                              text-align: left;
                                              padding-bottom: 5px;
                                              padding-top: 7px;
                                              vertical-align: top;
                                              border-top: 0px;
                                              border-right: 0px;
                                              border-bottom: 0px;
                                              border-left: 0px;
                                            "
                                            width="100%"
                                          >
                                            <div
                                              class="spacer_block block-1"
                                              style="
                                                height: 20px;
                                                line-height: 20px;
                                                font-size: 1px;
                                              "
                                            >
                                               
                                            </div>
                                          </td>
                                        </tr>
                                      </tbody>
                                    </table>
                                  </td>
                                </tr>
                              </tbody>
                            </table>
                            <table
                              align="center"
                              border="0"
                              cellpadding="0"
                              cellspacing="0"
                              class="row row-2"
                              role="presentation"
                              style="mso-table-lspace: 0pt; mso-table-rspace: 0pt"
                              width="100%"
                            >
                              <tbody>
                                <tr>
                                  <td>
                                    <table
                                      align="center"
                                      border="0"
                                      cellpadding="0"
                                      cellspacing="0"
                                      class="row-content stack"
                                      role="presentation"
                                      style="
                                        mso-table-lspace: 0pt;
                                        mso-table-rspace: 0pt;
                                        background-color: #fbfbfb;
                                        color: #000;
                                        width: 680px;
                                        margin: 0 auto;
                                      "
                                      width="680"
                                    >
                                      <tbody>
                                        <tr>
                                          <td
                                            class="column column-1"
                                            style="
                                              mso-table-lspace: 0pt;
                                              mso-table-rspace: 0pt;
                                              font-weight: 400;
                                              text-align: left;
                                              vertical-align: top;
                                              border-top: 0px;
                                              border-right: 0px;
                                              border-bottom: 0px;
                                              border-left: 0px;
                                            "
                                            width="100%"
                                          >
                                            <div
                                              class="spacer_block block-1"
                                              style="
                                                height: 7px;
                                                line-height: 7px;
                                                font-size: 1px;
                                              "
                                            >
                                               
                                            </div>
                                          </td>
                                        </tr>
                                      </tbody>
                                    </table>
                                  </td>
                                </tr>
                              </tbody>
                            </table>
                            <table
                              align="center"
                              border="0"
                              cellpadding="0"
                              cellspacing="0"
                              class="row row-3"
                              role="presentation"
                              style="mso-table-lspace: 0pt; mso-table-rspace: 0pt"
                              width="100%"
                            >
                              <tbody>
                                <tr>
                                  <td>
                                    <table
                                      align="center"
                                      border="0"
                                      cellpadding="0"
                                      cellspacing="0"
                                      class="row-content stack"
                                      role="presentation"
                                      style="
                                        mso-table-lspace: 0pt;
                                        mso-table-rspace: 0pt;
                                        background-color: #fbfbfb;
                                        color: #000;
                                        width: 680px;
                                        margin: 0 auto;
                                      "
                                      width="680"
                                    >
                                      <tbody>
                                        <tr>
                                          <td
                                            class="column column-1"
                                            style="
                                              mso-table-lspace: 0pt;
                                              mso-table-rspace: 0pt;
                                              font-weight: 400;
                                              text-align: left;
                                              padding-bottom: 5px;
                                              padding-top: 7px;
                                              vertical-align: top;
                                              border-top: 0px;
                                              border-right: 0px;
                                              border-bottom: 0px;
                                              border-left: 0px;
                                            "
                                            width="100%"
                                          >
                                            <table
                                              border="0"
                                              cellpadding="0"
                                              cellspacing="0"
                                              class="divider_block block-1"
                                              role="presentation"
                                              style="
                                                mso-table-lspace: 0pt;
                                                mso-table-rspace: 0pt;
                                              "
                                              width="100%"
                                            >
                                              <tr>
                                                <td
                                                  class="pad"
                                                  style="padding-bottom: 5px; padding-top: 5px"
                                                >
                                                  <div align="center" class="alignment">
                                                    <table
                                                      border="0"
                                                      cellpadding="0"
                                                      cellspacing="0"
                                                      role="presentation"
                                                      style="
                                                        mso-table-lspace: 0pt;
                                                        mso-table-rspace: 0pt;
                                                      "
                                                      width="100%"
                                                    >
                                                      <tr>
                                                        <td
                                                          class="divider_inner"
                                                          style="
                                                            font-size: 1px;
                                                            line-height: 1px;
                                                            border-top: 3px solid #f2f2f2;
                                                          "
                                                        >
                                                          <span> </span>
                                                        </td>
                                                      </tr>
                                                    </table>
                                                  </div>
                                                </td>
                                              </tr>
                                            </table>
                                          </td>
                                        </tr>
                                      </tbody>
                                    </table>
                                  </td>
                                </tr>
                              </tbody>
                            </table>
                            <table
                              align="center"
                              border="0"
                              cellpadding="0"
                              cellspacing="0"
                              class="row row-4"
                              role="presentation"
                              style="mso-table-lspace: 0pt; mso-table-rspace: 0pt"
                              width="100%"
                            >
                              <tbody>
                                <tr>
                                  <td>
                                    <table
                                      align="center"
                                      border="0"
                                      cellpadding="0"
                                      cellspacing="0"
                                      class="row-content stack"
                                      role="presentation"
                                      style="
                                        mso-table-lspace: 0pt;
                                        mso-table-rspace: 0pt;
                                        background-color: #fbfbfb;
                                        color: #000;
                                        width: 680px;
                                        margin: 0 auto;
                                      "
                                      width="680"
                                    >
                                      <tbody>
                                        <tr class="reverse">
                                          <td
                                            class="column column-1 first"
                                            style="
                                              mso-table-lspace: 0pt;
                                              mso-table-rspace: 0pt;
                                              font-weight: 400;
                                              text-align: left;
                                              padding-bottom: 35px;
                                              padding-left: 25px;
                                              padding-top: 35px;
                                              vertical-align: top;
                                              border-top: 0px;
                                              border-right: 0px;
                                              border-bottom: 0px;
                                              border-left: 0px;
                                            "
                                            width="50%"
                                          >
                                            <div class="border">
                                              <table
                                                border="0"
                                                cellpadding="0"
                                                cellspacing="0"
                                                class="heading_block block-1"
                                                role="presentation"
                                                style="
                                                  mso-table-lspace: 0pt;
                                                  mso-table-rspace: 0pt;
                                                "
                                                width="100%"
                                              >
                                                <tr>
                                                  <td
                                                    class="pad"
                                                    style="
                                                      padding-left: 5px;
                                                      padding-top: 10px;
                                                      text-align: center;
                                                      width: 100%;
                                                    "
                                                  >
                                                    <h1
                                                      style="
                                                        margin: 0;
                                                        color: #fe7062;
                                                        direction: ltr;
                                                        font-family: Cabin, Arial,
                                                          Helvetica Neue, Helvetica, sans-serif;
                                                        font-size: 13px;
                                                        font-weight: 700;
                                                        letter-spacing: 1px;
                                                        line-height: 120%;
                                                        text-align: left;
                                                        margin-top: 0;
                                                        margin-bottom: 0;
                                                      "
                                                    >
                                                      <span class="tinyMce-placeholder"
                                                        >Gracias por comprar con CapCol</span
                                                      >
                                                    </h1>
                                                  </td>
                                                </tr>
                                              </table>
                                              <table
                                                border="0"
                                                cellpadding="0"
                                                cellspacing="0"
                                                class="heading_block block-2"
                                                role="presentation"
                                                style="
                                                  mso-table-lspace: 0pt;
                                                  mso-table-rspace: 0pt;
                                                "
                                                width="100%"
                                              >
                                                <tr>
                                                  <td
                                                    class="pad"
                                                    style="
                                                      padding-bottom: 10px;
                                                      padding-left: 5px;
                                                      padding-right: 5px;
                                                      padding-top: 5px;
                                                      text-align: center;
                                                      width: 100%;
                                                    "
                                                  >
                                                    <h1
                                                      style="
                                                        margin: 0;
                                                        color: #2f2e41;
                                                        direction: ltr;
                                                        font-family: 'Cabin', Arial,
                                                          'Helvetica Neue', Helvetica,
                                                          sans-serif;
                                                        font-size: 29px;
                                                        font-weight: 400;
                                                        letter-spacing: 1px;
                                                        line-height: 120%;
                                                        text-align: left;
                                                        margin-top: 0;
                                                        margin-bottom: 0;
                                                      "
                                                    >
                                                      <strong>Hola """ + name + """

                                                              , Hemos recibido tu pedido</strong>
                                                    </h1>
                                                  </td>
                                                </tr>
                                              </table>
                                              <table
                                                border="0"
                                                cellpadding="0"
                                                cellspacing="0"
                                                class="paragraph_block block-3"
                                                role="presentation"
                                                style="
                                                  mso-table-lspace: 0pt;
                                                  mso-table-rspace: 0pt;
                                                  word-break: break-word;
                                                "
                                                width="100%"
                                              >
                                                <tr>
                                                  <td
                                                    class="pad"
                                                    style="
                                                      padding-bottom: 10px;
                                                      padding-left: 5px;
                                                      padding-right: 5px;
                                                      padding-top: 10px;
                                                    "
                                                  >
                                                    <div
                                                      style="
                                                        color: #393d47;
                                                        direction: ltr;
                                                        font-family: Cabin, Arial,
                                                          Helvetica Neue, Helvetica, sans-serif;
                                                        font-size: 15px;
                                                        font-weight: 400;
                                                        letter-spacing: 0px;
                                                        line-height: 150%;
                                                        text-align: left;
                                                        mso-line-height-alt: 22.5px;
                                                      "
                                                    >
                                                      <p style="margin: 0">
                                                        Estamos en proceso de revisión de tu
                                                        pedido para realizar el respectivo
                                                        envió, te confirmaremos lo más pronto
                                                        posible
                                                      </p>
                                                    </div>
                                                  </td>
                                                </tr>
                                              </table>
                                            </div>
                                          </td>
                                          <td
                                            class="column column-2 last"
                                            style="
                                              mso-table-lspace: 0pt;
                                              mso-table-rspace: 0pt;
                                              font-weight: 400;
                                              text-align: left;
                                              padding-bottom: 5px;
                                              vertical-align: top;
                                              border-top: 0px;
                                              border-right: 0px;
                                              border-bottom: 0px;
                                              border-left: 0px;
                                            "
                                            width="50%"
                                          >
                                            <div class="border">
                                              <table
                                                border="0"
                                                cellpadding="20"
                                                cellspacing="0"
                                                class="image_block block-1"
                                                role="presentation"
                                                style="
                                                  mso-table-lspace: 0pt;
                                                  mso-table-rspace: 0pt;
                                                "
                                                width="100%"
                                              >
                                                <tr>
                                                  <td class="pad">
                                                    <div
                                                      align="center"
                                                      class="alignment"
                                                      style="line-height: 10px"
                                                    >
                                                      <img
                                                        alt="Resume"
                                                        class="fullWidth"
                                                        style="
                                                          display: block;
                                                          height: auto;
                                                          border: 0;
                                                          max-width: 282.2px;
                                                          width: 100%;
                                                        "
                                                        title="Resume"
                                                        width="282.2"
                                                      />
                                                    </div>
                                                  </td>
                                                </tr>
                                              </table>
                                            </div>
                                          </td>
                                        </tr>
                                      </tbody>
                                    </table>
                                  </td>
                                </tr>
                              </tbody>
                            </table>
                            <table
                              align="center"
                              border="0"
                              cellpadding="0"
                              cellspacing="0"
                              class="row row-5"
                              role="presentation"
                              style="mso-table-lspace: 0pt; mso-table-rspace: 0pt"
                              width="100%"
                            >
                              <tbody>
                                <tr>
                                  <td>
                                    <table
                                      align="center"
                                      border="0"
                                      cellpadding="0"
                                      cellspacing="0"
                                      class="row-content stack"
                                      role="presentation"
                                      style="
                                        mso-table-lspace: 0pt;
                                        mso-table-rspace: 0pt;
                                        background-color: #fbfbfb;
                                        color: #000;
                                        width: 680px;
                                        margin: 0 auto;
                                      "
                                      width="680"
                                    >
                                      <tbody>
                                        <tr>
                                          <td
                                            class="column column-1"
                                            style="
                                              mso-table-lspace: 0pt;
                                              mso-table-rspace: 0pt;
                                              font-weight: 400;
                                              text-align: left;
                                              vertical-align: top;
                                              border-top: 0px;
                                              border-right: 0px;
                                              border-bottom: 0px;
                                              border-left: 0px;
                                            "
                                            width="100%"
                                          >
                                            <div
                                              class="spacer_block block-1"
                                              style="
                                                height: 10px;
                                                line-height: 10px;
                                                font-size: 1px;
                                              "
                                            >

                                            </div>
                                          </td>
                                        </tr>
                                      </tbody>
                                    </table>
                                  </td>
                                </tr>
                              </tbody>
                            </table>
                            <table
                              align="center"
                              border="0"
                              cellpadding="0"
                              cellspacing="0"
                              class="row row-6"
                              role="presentation"
                              style="mso-table-lspace: 0pt; mso-table-rspace: 0pt"
                              width="100%"
                            >
                              <tbody>
                                <tr>
                                  <td>
                                    <table
                                      align="center"
                                      border="0"
                                      cellpadding="0"
                                      cellspacing="0"
                                      class="row-content stack"
                                      role="presentation"
                                      style="
                                        mso-table-lspace: 0pt;
                                        mso-table-rspace: 0pt;
                                        color: #000;
                                        width: 680px;
                                        margin: 0 auto;
                                      "
                                      width="680"
                                    >
                                      <tbody>
                                        <tr>
                                          <td
                                            class="column column-1"
                                            style="
                                              mso-table-lspace: 0pt;
                                              mso-table-rspace: 0pt;
                                              font-weight: 400;
                                              text-align: left;
                                              vertical-align: top;
                                              border-top: 0px;
                                              border-right: 0px;
                                              border-bottom: 0px;
                                              border-left: 0px;
                                            "
                                            width="100%"
                                          >
                                            <div
                                              class="spacer_block block-1"
                                              style="
                                                height: 20px;
                                                line-height: 20px;
                                                font-size: 1px;
                                              "
                                            >
                                               
                                            </div>
                                          </td>
                                        </tr>
                                      </tbody>
                                    </table>
                                  </td>
                                </tr>
                              </tbody>
                            </table>
                  </body>
                </html>
                      """;
    }
}
