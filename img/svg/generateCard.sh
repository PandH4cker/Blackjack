#!/bin/bash

for color in ♥ ♠ ♦ ♣; do 

	case $color in 
	♥) fill="#ff0000" name="HEART";;
	♦) fill="#ff0000" name="DIAMOND";;
	♠) fill="#000000" name="SPADE";;
	♣) fill="#000000" name="CLUB";;
	esac
	
	for value in A 2 3 4 5 6 7 8 9 10 J Q K; do
	
	

echo "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>
<!-- Created with Inkscape (http://www.inkscape.org/) -->

<svg
   xmlns:dc=\"http://purl.org/dc/elements/1.1/\"
   xmlns:cc=\"http://creativecommons.org/ns#\"
   xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"
   xmlns:svg=\"http://www.w3.org/2000/svg\"
   xmlns=\"http://www.w3.org/2000/svg\"
   version=\"1.1\"
   width=\"56\"
   height=\"87\"
   id=\"svg2\">
  <defs
     id=\"defs4\" />
  <metadata
     id=\"metadata7\">
    <rdf:RDF>
      <cc:Work
         rdf:about=\"\">
        <dc:format>image/svg+xml</dc:format>
        <dc:type
           rdf:resource=\"http://purl.org/dc/dcmitype/StillImage\" />
        <dc:title></dc:title>
      </cc:Work>
    </rdf:RDF>
  </metadata>
  <g
     transform=\"translate(-50.09375,-44.4375)\"
     id=\"layer1\">
    <rect
       width=\"55.66349\"
       height=\"86.66349\"
       ry=\"8.6955986\"
       x=\"50.265675\"
       y=\"44.607674\"
       id=\"rect2991\"
       style=\"fill:#ffffff;stroke:#000000;stroke-width:0.33651042px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\" />
    <g
       transform=\"translate(0.11135133,-0.18741182)\"
       id=\"g3114\">
      <text
         x=\"51.984432\"
         y=\"64.619629\"
         transform=\"scale(1.0096038,0.99048756)\"
         id=\"text2993\"
         xml:space=\"preserve\"
         style=\"font-size:18px;font-style:normal;font-weight:normal;text-align:start;line-height:125%;letter-spacing:0px;word-spacing:0px;text-anchor:start;fill:$fill;fill-opacity:1;stroke:none;font-family:Sans\"><tspan
           x=\"51.984432\"
           y=\"64.619629\"
           id=\"tspan2995\"
           style=\"font-size:18px;text-align:start;text-anchor:start\">$value</tspan></text>
      <text
         x=\"103.08273\"
         y=\"64.071663\"
         id=\"text2997\"
         xml:space=\"preserve\"
         style=\"font-size:40px;font-style:normal;font-weight:normal;text-align:end;line-height:125%;letter-spacing:0px;word-spacing:0px;text-anchor:end;fill:$fill;fill-opacity:1;stroke:none;font-family:Sans\"><tspan
           x=\"103.08273\"
           y=\"64.071663\"
           id=\"tspan2999\"
           style=\"font-size:18px;text-align:end;text-anchor:end\">$color</tspan></text>
      <text
         x=\"101.73059\"
         y=\"126.43123\"
         transform=\"scale(1.0096038,0.99048756)\"
         id=\"text3001\"
         xml:space=\"preserve\"
         style=\"font-size:18px;font-style:normal;font-weight:normal;text-align:end;line-height:125%;letter-spacing:0px;word-spacing:0px;text-anchor:end;fill:$fill;fill-opacity:1;stroke:none;font-family:Sans\"><tspan
           x=\"101.73059\"
           y=\"126.43123\"
           id=\"tspan3003\">$value</tspan></text>
      <text
         x=\"52.880604\"
         y=\"125.29529\"
         id=\"text3005\"
         xml:space=\"preserve\"
         style=\"font-size:18px;font-style:normal;font-weight:normal;text-align:start;line-height:125%;letter-spacing:0px;word-spacing:0px;text-anchor:start;fill:$fill;fill-opacity:1;stroke:none;font-family:Sans\"><tspan
           x=\"52.880604\"
           y=\"125.29529\"
           id=\"tspan3007\"
           style=\"font-size:18px;text-align:start;text-anchor:start\">$color</tspan></text>
    </g>
  </g>
</svg>" > card_${name}_${value}.svg

inkscape --export-dpi=90 --export-png="card_${name}_${value}.png" "card_${name}_${value}.svg"
done

done


