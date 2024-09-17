package com.firebase.vcentinals;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/google")
    public Map<String, String> googleSignIn(@RequestBody Map<String, String> payload) throws FirebaseAuthException {
        String idToken = payload.get("idToken");
        FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(idToken);
        String uid = decodedToken.getUid();

        // Optionally, create a session or JWT token for the user in your backend

        Map<String, String> response = new HashMap<>();
        response.put("uid", uid);
        response.put("status", "success");
        return response;
    }
}
