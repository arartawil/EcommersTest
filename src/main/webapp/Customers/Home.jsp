<%--
  Created by IntelliJ IDEA.
  User: arartawil
  Date: 02/04/18
  Time: 06:40 م
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Store</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/modern-business.css" rel="stylesheet">

</head>
<body>
<form id="form1" runat="server">
    <!-- Navigation -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
        <div class="container">
            <a class="navbar-brand" href="index.html">Start Bootstrap</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <div class="navbar-form navbar-left">
                    <div class="input-group">
                        <input type="text" name="txt_Serach" class="form-control" placeholder="Search" >

                        <input type="submit" class="btn btn-info"  value="Serach" >
                    </div>
                </div>
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="about.html" style="font-size:x-large;">About</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link" style="font-size:x-large">profile</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link" style="font-size:x-large">Cart</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link" style="font-size:x-large">Favorite</a>
                    </li>
                    <li class="nav-item">
                        <form id="form2" action="#">
                            <input type="submit" class="btn btn-info"  value="Serach" >
                        </form>
                        <a href="#" class="nav-link" style="font-size:x-large">Favorite</a>
                        <asp:LinkButton ID="LinkButton1" runat="server" Text="Log out" CssClass="nav-link" Font-Size="X-Large" OnClick="LinkButton1_Click" />
                    </li>

                </ul>
            </div>
        </div>
    </nav>
    <header>
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <!-- Slide One - Set the background image for this slide in the line below -->
                <div class="carousel-item active" style="background-image: url('http://placehold.it/1900x1080')">
                    <div class="carousel-caption d-none d-md-block">
                        <h3>First Slide</h3>
                        <p>This is a description for the first slide.</p>
                    </div>
                </div>
                <!-- Slide Two - Set the background image for this slide in the line below -->
                <div class="carousel-item" style="background-image: url('http://placehold.it/1900x1080')">
                    <div class="carousel-caption d-none d-md-block">
                        <h3>Second Slide</h3>
                        <p>This is a description for the second slide.</p>
                    </div>
                </div>
                <!-- Slide Three - Set the background image for this slide in the line below -->
                <div class="carousel-item" style="background-image: url('http://placehold.it/1900x1080')">
                    <div class="carousel-caption d-none d-md-block">
                        <h3>Third Slide</h3>
                        <p>This is a description for the third slide.</p>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </header>

    <!-- Page Content -->
    <div class="container">

        <h1 class="my-4">Welcome Online Store</h1>

        <!-- Marketing Icons Section -->
        <div class="row">
            <div class="col-lg-4 mb-4">
                <div class="card h-100">
                    <h4 class="card-header">Clothes</h4>
                    <div class="card-body">
                        <asp:Image ID="Image1" runat="server" ImageUrl="~/Image/cothes.jpg" />

                    </div>
                    <div class="card-footer">
                        <asp:Button ID="btn_btnClothes" runat="server" Text="See More" CssClass="btn btn-primary" OnClick="Button1_Click"/>

                    </div>
                </div>
            </div>
            <div class="col-lg-4 mb-4">
                <div class="card h-100">
                    <h4 class="card-header">Technology</h4>
                    <div class="card-body">
                        <asp:Image ID="Image2" runat="server" ImageUrl="~/Image/Compter1.jpg" Width="300px" Height="300px"  />
                    </div>
                    <div class="card-footer">
                        <asp:Button ID="btn_Tec" runat="server" Text="See More" CssClass="btn btn-primary" OnClick="btn_Tec_Click" />

                    </div>
                </div>
            </div>
            <div class="col-lg-4 mb-4">
                <div class="card h-100">
                    <h4 class="card-header">All Things</h4>
                    <div class="card-body">


                        <table >
                            <tr>
                                <td style="width:25%">
                                    <asp:Image ID="Image3" runat="server" ImageUrl="~/Image/ساعات.jpg" Width="150" Height="150"   />
                                </td>
                                <td  style="width:25%">
                                    <asp:Image ID="Image4" runat="server" ImageUrl="~/Image/furnitre.jpg" Width="150" Height="150" />
                                </td>
                            </tr>
                            <tr>
                                <td  style="width:25%">
                                    <asp:Image ID="Image6" runat="server" ImageUrl="~/Image/عطور.jpg" Width="150" Height="150" />
                                </td>
                                <td  style="width:25%">
                                    <asp:Image ID="Image5" runat="server" ImageUrl="~/Image/عطور.jpg" Width="150" Height="150" />
                                </td>
                            </tr>
                        </table>


                    </div>
                    <div class="card-footer">
                        <asp:Button ID="btn_All" runat="server" Text="See More" CssClass="btn btn-primary" OnClick="btn_All_Click" />

                    </div>
                </div>
            </div>
        </div>
        <!-- /.row -->

        <!-- Portfolio Section -->

        <hr>

        <!-- Call to Action Section -->
        <div class="row mb-4">
            <div class="col-md-8">
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestias, expedita, saepe, vero rerum deleniti beatae veniam harum neque nemo praesentium cum alias asperiores commodi.</p>
            </div>
            <div class="col-md-4">
                <a class="btn btn-lg btn-secondary btn-block" href="#">Call to Action</a>
            </div>
        </div>

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white">Copyright &copy; Your Website 2017</p>
        </div>
        <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

</form>
</body>
</html>
