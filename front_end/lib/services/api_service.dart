import 'dart:convert';
import 'package:http/http.dart' as http;
import '../models/place.dart';

class ApiService {
  static const baseUrl = "http://localhost:8080/api/place";

  static Future<List<Place>> getAllPlace() async {
    final url = Uri.parse("$baseUrl/getAllPlace");
    final res = await http.get(url);

    if (res.statusCode == 200) {
      final data = jsonDecode(res.body) as List;
      return data.map((e) => Place.fromJson(e)).toList();
    }

    throw Exception("Failed to load places");
  }
}
