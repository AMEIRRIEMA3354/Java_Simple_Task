<!DOCTYPE html>
<html>
    <head>
        <title>Simple Ordering System</title>
        <style>
            .style-item{
                display:inline-block;
                text-align:center;
                margin:20px;
                margin-bottom:5%;
                cursor:pointer;
                position:relative;
                /* dia bgtau bahawa content yg ada dlm elemen ni akan pakai position:absolute */
                /* bila guna relative dia akan ada dkt tempat dia shj  */
                /* xeffect yg len */
            }
            .style-item img{
                width:300px;
                height:300px;
                border-radius:8px;
            }
            .food-item p{
                margin-top:10px;
            }
            .detail-content {
    width: 200px;
    height: 60px;
    border-radius: 8px;
    background-image: url("Gambar/bgimage.jpg");
    /* background-size:100%; */
    background-size: cover;
    position: absolute; /* Memungkinkan penempatan bebas */
    /* bantu utk gerakkan dia parent element dia pakai position relative */
    bottom: -30px; /* Atur ini untuk menempatkan detail-content di bawah gambar */
    left: 18%; /* Pusatkan secara horizontal */
   
}
          
            /* popup */
            .popup-container{
                display:none;
                position:absolute;
                top:0;
                left:0;
                width:100%;
                height:100%;
                background-color:rgba(0,0,0,0.5);
                justify-content:center;
                align-items:center;
            }

            .popup-content{
                background-color:white;
                padding:20px;
                border-radius:8px;
                width:300px;
                text-align:center;
            }

            .close-btn {
                background-color: black;
                color: white;
                border: none;
                padding: 10px;
                border-radius: 5px;
                cursor: pointer;
                margin-top: 10px;
            }
            p{
                font-family: "Rock Salt", cursive;;
            }

        </style>
    </head>
    <body>
        <!-- top -->
       <center>
        <h1>Order Your Choice of Style</h1>
        <form id="orderForm" action="order_form.php" method="POST">
            <input type="hidden" id="itemName" name="itemName">
            <label for="quantity">Quantity:</label>
            <input type="number" id="quantity" name="quantity" min="0" value="" style="margin-bottom:10px">
            <br>
            <input type="hidden" value="Submit Order">
        </form>
       </center>

       <!-- content -->
        <center>
    <div class="style-item" onclick="selectItem('Shirt')">
        <img src="Gambar/baju3.png" alt="Shirt">
        <div class="detail-content">
            <p>Shirt</p>
        </div>
    </div>


        <div class="style-item" onclick="selectItem('Denim')">
            <img src="Gambar/denim.jpg" alt="Denim">
            <div class="detail-content">
            <p>Denim</p>
            </div>
        </div>

        <div class="style-item" onclick="selectItem('Hat')">
            <img src="Gambar/hat.png" alt="Hat">
            <div class="detail-content">
            <p>Hat</p>
        </div>
        </div>

        <div class="style-item" onclick="selectItem('Sweat Shirt')">
            <img src="Gambar/sweatshirt.png" alt="Sweat Shirt">
            <div class="detail-content">
            <p>Sweat Shirt</p>
        </div>
        </div>

        <div class="style-item" onclick="selectItem('Track Pants')">
            <img src="Gambar/track pants.png" alt="Track Pants">
            <div class="detail-content">
            <p>Track Pants</p>
        </div>
        </div>

        <div class="style-item" onclick="selectItem('Jacket')">
            <img src="Gambar/jackt2.png" alt="Jacket">
            <div class="detail-content">
            <p>Jacket</p>
        </div>
        </div>
        </center>

        <!-- popup -->
        <div class="popup-container" id="popup-container">
            <div class="popup-content" id="popupContent">

            </div>
        </div>

        <script>
            // function untuk paparkan nama item,quantity
            function selectItem(itemName){
                document.getElementById('itemName').value = itemName;
                var quantity = document.getElementById('quantity').value;
                document.getElementById('quantity').value = quantity;
                document.getElementById('orderForm').submit();

            }

            // function untuk memaparkan popup
            function showPopup(content){
                document.getElementById('popupContent').innerHTML = content;
                document.getElementById('popup-container').style.display = "flex";
            }

            //function untuk menutup popup
            function closePopup(){
                document.getElementById('popup-container').style.display = "none";
            }

            document.querySelector(".close-btn").addEventListener('click',closePopup);
        </script>

<?php
if($_SERVER["REQUEST_METHOD"] == "POST"){
    $itemName = $_POST['itemName'];
    $quantity = $_POST['quantity'];

    $prices = ['Shirt' => 25,'Jacket' => 35,'Denim' => 55,'Hat' => 20,'Sweat Shirt' => 33,'Track Pants' => 15];

    if(array_key_exists($itemName,$prices)){
        $price_setiap_item = $prices[$itemName];
        $harga_total = $price_setiap_item * $quantity;

        $orderSummary = "<h1>Order Summary</h1>";
        $orderSummary .= "<p>Item:$itemName</p>";
        $orderSummary .= "<p>Quantity:$quantity</p>";
        $orderSummary .= "<p>Price Per Item: $" . number_format($price_setiap_item,2) . "</p>";
        $orderSummary .= "<p>Total Price: $" . number_format($harga_total,2) . "</p>";
        $orderSummary .= "<button class='close-btn' onclick='closePopup()'>Close</button>";

        //ringkasan utk showPopup
        echo "<script type='text/javascript'>
             showPopup(". json_encode ($orderSummary)  . ");
        </script>";

    }else{
        echo "<p>Invalid item selected.</p>";
    }
}
// }else{
//     echo "<p>Invalid request.</p>";
// }
?>
    </body>
</html>
