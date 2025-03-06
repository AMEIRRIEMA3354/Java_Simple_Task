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
            input[type='number']{
                border-bottom-color: greenyellow;
                border-right-color:greenyellow;
                border-top-color:transparent;
                border-left-color:transparent;
                width:200px;
                height:30px;
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
                background:url('Gambar/bgimage.jpg');
                background-size:cover;
                padding:20px;
                border-radius:8px;
                width:600px;
                text-align:center;
            }
            /* .size-List{
                list-style-type:none;
                display:grid;
                grid-template-columns: repeat(4);
                border:2px solid black;
                gap:30px;
                box-sizing:border-box;
            } */

            /* .popup-content img{
                float:left;
                width:300px;
                height:300px;
                border-radius:8px;
                margin-left:3px;
            } */
            .popup-content .right-content{
                float:right;
                width:300px;
                margin-right:3px;
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
            .order-btn{
                /* background:url('Gambar/bgimage.jpg');
                background-size: cover; */
                background-color:white;
                border: none;
                padding: 10px;
                border-radius: 5px;
                margin-right:5%;
            }
            p{
                font-family: "Rock Salt", cursive;
            }
            .popup-content h1{
                font-family: "Rock Salt", cursive;
            }
            .error-image{
                width:100px;
                height:100px;
            }
        </style>
    </head>
    <body>
        <!-- top -->
       <center>
        <h1>Order Your Choice of Style</h1>
        <form id="orderForm" action="menu.php" method="POST">
            <input type="hidden" id="itemName" name="itemName">
            <!-- <label for="quantity">Quantity:</label> -->
            <!-- <input type="number" id="quantity" name="quantity" min="0" value="" style="margin-bottom:10px" placeholder="Quantity">
            <br> -->
            <!-- <input type="hidden" value="Submit Order" onclick="selectItem()"> -->
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
            // pemeriksaan validasi
            // function untuk paparkan nama item,quantity
            function selectItem(itemName){
            var itemName = itemName || document.getElementById('itemName').value;
            // var quantity = document.getElementById('quantity').value; 
        
            if(!itemName || itemName == ""){
                showPopup('Error:Sila Pilih Item');
                return;
            }

            // if(quantity <= 0 || quantity == ""){
            //    showPopup('Error:Masukkan kuantiti item');
            //    return;
            // }
            document.getElementById('itemName').value = itemName;
            document.getElementById('orderForm').submit();

            }

            // function untuk memaparkan popup
            function showPopup(content){
                document.getElementById('popupContent').innerHTML = content;
                document.getElementById('popup-container').style.display = "flex";


            // if(!itemName || itemName == ""){
            //     var content = `<img src="${imgSrc}" class="error-image" alt="Error">`; // Add error image
            //     content += `<p>${message}</p>`; // Add the error message
            //     content += "<button class='close-btn' onclick='closePopup()'>Close</button>"; // Close button
            //     showPopup('Error:Sila Pilih Item','Gambar/error.png');
            //     return;
            // }

            // if(quantity <= 0 || quantity == ""){
            //     var content = `<img src="${imgSrc}" class="error-image" alt="Error">`; // Add error image
            //     content += `<p>${message}</p>`; // Add the error message
            //     content += "<button class='close-btn' onclick='closePopup()'>Close</button>"; // Close button
            //    showPopup('Error:Masukkan kuantiti item','Gambar/error.png');
            //    return;
            // }
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
    // $quantity = $_POST['quantity'];

    $prices = ['Shirt' => 25,'Jacket' => 35,'Denim' => 55,'Hat' => 20,'Sweat Shirt' => 33,'Track Pants' => 15];
    $sizes = ['Extra Small','Small','Medium','Large','Extra Large','Double Extra Large','2 Extra Large','3 Extra Large'];
    $images = [
        'Shirt' => 'Gambar/baju3.png',
        'Jacket' => 'Gambar/jackt2.png',
        'Denim' => 'Gambar/denim.jpg',
        'Hat' => 'Gambar/hat.png',
        'Sweat Shirt' => 'Gambar/sweatshirt.png',
        'Track Pants' => 'Gambar/track pants.png'
    ];

    if(array_key_exists($itemName,$prices)){
        $price_setiap_item = $prices[$itemName];
        // $harga_total = $price_setiap_item * $quantity;


        $sizeList = "<table class='size-List' style='width:40%; border:1px solid black; text-align:center; position:relative;left:7%;' >";
        foreach ($sizes as $size){
            $sizeList .= "<tr style='border:1px solid black;'><td style=' cellspacing:0px; cellpadding:12px;  border-left: none;border-right: none; border-bottom:1px solid black; '>$size</td></tr>";
        }
        $sizeList .="</table>";

        $itemImage = isset($images[$itemName]) ? $images[$itemName] : '';
        $itemDetail = "<h1>Item Detail</h1>";

        if($itemImage){
            $itemDetail .= "<img src='$itemImage' alt='$itemName' style='float:left; width: 280px; height: 310px; margin-left:3px; border-radius:3px;>";

        }

        $itemDetail .= "<div class='right-content'>";
        $itemDetail .= "<p><strong>Item:$itemName</strong></p>";
        $itemDetail .= "<p><strong>Size Available:</strong>$sizeList</p>";
        // $itemDetail .= "<p>Quantity:$quantity</p>";
        $itemDetail .= "<p><strong>Price Per Item: $" . number_format($price_setiap_item,2) . "</strong></p>";
        // $itemDetail .= "<p>Total Price: $" . number_format($harga_total,2) . "</p>";
        $itemDetail .= "<button class='order-btn' onclick='orderItem()'>Order</button>";
        $itemDetail .= "<button class='close-btn' onclick='closePopup()'>Close</button>";
        $itemDetail .= "</div>";

        $itemDetail = addslashes($itemDetail);

        //ringkasan utk showPopup
        echo "<script type='text/javascript'>
             var itemDetail = '$itemDetail';
             showPopup('$itemDetail');
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